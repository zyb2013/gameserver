-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceEditSeat_pb', package.seeall)


local BCEEDITSEAT = protobuf.Descriptor();
local BCEEDITSEAT_INDEX_FIELD = protobuf.FieldDescriptor();
local BCEEDITSEAT_OPEN_FIELD = protobuf.FieldDescriptor();

BCEEDITSEAT_INDEX_FIELD.name = "index"
BCEEDITSEAT_INDEX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceEditSeat.index"
BCEEDITSEAT_INDEX_FIELD.number = 1
BCEEDITSEAT_INDEX_FIELD.index = 0
BCEEDITSEAT_INDEX_FIELD.label = 2
BCEEDITSEAT_INDEX_FIELD.has_default_value = false
BCEEDITSEAT_INDEX_FIELD.default_value = 0
BCEEDITSEAT_INDEX_FIELD.type = 5
BCEEDITSEAT_INDEX_FIELD.cpp_type = 1

BCEEDITSEAT_OPEN_FIELD.name = "open"
BCEEDITSEAT_OPEN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceEditSeat.open"
BCEEDITSEAT_OPEN_FIELD.number = 2
BCEEDITSEAT_OPEN_FIELD.index = 1
BCEEDITSEAT_OPEN_FIELD.label = 2
BCEEDITSEAT_OPEN_FIELD.has_default_value = false
BCEEDITSEAT_OPEN_FIELD.default_value = false
BCEEDITSEAT_OPEN_FIELD.type = 8
BCEEDITSEAT_OPEN_FIELD.cpp_type = 7

BCEEDITSEAT.name = "BceEditSeat"
BCEEDITSEAT.full_name = ".com.xinqihd.sns.gameserver.proto.BceEditSeat"
BCEEDITSEAT.nested_types = {}
BCEEDITSEAT.enum_types = {}
BCEEDITSEAT.fields = {BCEEDITSEAT_INDEX_FIELD, BCEEDITSEAT_OPEN_FIELD}
BCEEDITSEAT.is_extendable = false
BCEEDITSEAT.extensions = {}

BceEditSeat = protobuf.Message(BCEEDITSEAT)
_G.BCEEDITSEAT_PB_BCEEDITSEAT = BCEEDITSEAT
