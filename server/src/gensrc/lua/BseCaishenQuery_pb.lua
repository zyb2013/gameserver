-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseCaishenQuery_pb', package.seeall)


local BSECAISHENQUERY = protobuf.Descriptor();
local BSECAISHENQUERY_COUNT_FIELD = protobuf.FieldDescriptor();
local BSECAISHENQUERY_PRICE_FIELD = protobuf.FieldDescriptor();
local BSECAISHENQUERY_GOLDENVALUE_FIELD = protobuf.FieldDescriptor();
local BSECAISHENQUERY_INFO_FIELD = protobuf.FieldDescriptor();

BSECAISHENQUERY_COUNT_FIELD.name = "count"
BSECAISHENQUERY_COUNT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseCaishenQuery.count"
BSECAISHENQUERY_COUNT_FIELD.number = 1
BSECAISHENQUERY_COUNT_FIELD.index = 0
BSECAISHENQUERY_COUNT_FIELD.label = 1
BSECAISHENQUERY_COUNT_FIELD.has_default_value = false
BSECAISHENQUERY_COUNT_FIELD.default_value = 0
BSECAISHENQUERY_COUNT_FIELD.type = 13
BSECAISHENQUERY_COUNT_FIELD.cpp_type = 3

BSECAISHENQUERY_PRICE_FIELD.name = "price"
BSECAISHENQUERY_PRICE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseCaishenQuery.price"
BSECAISHENQUERY_PRICE_FIELD.number = 2
BSECAISHENQUERY_PRICE_FIELD.index = 1
BSECAISHENQUERY_PRICE_FIELD.label = 1
BSECAISHENQUERY_PRICE_FIELD.has_default_value = false
BSECAISHENQUERY_PRICE_FIELD.default_value = 0
BSECAISHENQUERY_PRICE_FIELD.type = 13
BSECAISHENQUERY_PRICE_FIELD.cpp_type = 3

BSECAISHENQUERY_GOLDENVALUE_FIELD.name = "goldenvalue"
BSECAISHENQUERY_GOLDENVALUE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseCaishenQuery.goldenvalue"
BSECAISHENQUERY_GOLDENVALUE_FIELD.number = 3
BSECAISHENQUERY_GOLDENVALUE_FIELD.index = 2
BSECAISHENQUERY_GOLDENVALUE_FIELD.label = 1
BSECAISHENQUERY_GOLDENVALUE_FIELD.has_default_value = false
BSECAISHENQUERY_GOLDENVALUE_FIELD.default_value = 0
BSECAISHENQUERY_GOLDENVALUE_FIELD.type = 13
BSECAISHENQUERY_GOLDENVALUE_FIELD.cpp_type = 3

BSECAISHENQUERY_INFO_FIELD.name = "info"
BSECAISHENQUERY_INFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseCaishenQuery.info"
BSECAISHENQUERY_INFO_FIELD.number = 4
BSECAISHENQUERY_INFO_FIELD.index = 3
BSECAISHENQUERY_INFO_FIELD.label = 1
BSECAISHENQUERY_INFO_FIELD.has_default_value = false
BSECAISHENQUERY_INFO_FIELD.default_value = ""
BSECAISHENQUERY_INFO_FIELD.type = 9
BSECAISHENQUERY_INFO_FIELD.cpp_type = 9

BSECAISHENQUERY.name = "BseCaishenQuery"
BSECAISHENQUERY.full_name = ".com.xinqihd.sns.gameserver.proto.BseCaishenQuery"
BSECAISHENQUERY.nested_types = {}
BSECAISHENQUERY.enum_types = {}
BSECAISHENQUERY.fields = {BSECAISHENQUERY_COUNT_FIELD, BSECAISHENQUERY_PRICE_FIELD, BSECAISHENQUERY_GOLDENVALUE_FIELD, BSECAISHENQUERY_INFO_FIELD}
BSECAISHENQUERY.is_extendable = false
BSECAISHENQUERY.extensions = {}

BseCaishenQuery = protobuf.Message(BSECAISHENQUERY)
_G.BSECAISHENQUERY_PB_BSECAISHENQUERY = BSECAISHENQUERY

