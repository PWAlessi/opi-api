# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.
all: clean flatten build lint docs clean_temp

build:
	docker run -v "${PWD}":/defs namely/protoc-all:1.47_2 --lint -d ./temp -l go -o ./gen/go/  --go-source-relative
	docker run -v "${PWD}":/defs namely/protoc-all:1.47_2 --lint -d ./temp -l cpp -o ./gen/cpp/  --go-source-relative
	docker run -v "${PWD}":/defs namely/protoc-all:1.47_2 --lint -d ./temp -l python -o ./gen/python/  --go-source-relative

clean:
	rm -rf ./gen
	rm autogen.md

clean_temp:
	rm -rf ./temp

lint:
	docker run --rm -v "${PWD}"/temp:/out -w /out --entrypoint=sh ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter *.proto --output-format summary"

docs:
	docker run --rm -v "${PWD}":/out -v "${PWD}"/temp:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md

flatten:
	mkdir temp
	cp common/v1/*.proto ./temp
	cp network/v1/*.proto ./temp
	cp security/v1/*.proto ./temp
	cp security/firewall/v1/*.proto ./temp
	cp storage/v1/*.proto ./temp

