-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceSellTool_pb', package.seeall)


local BCESELLTOOL = protobuf.Descriptor();
local BCESELLTOOL_POS_FIELD = protobuf.FieldDescriptor();

BCESELLTOOL_POS_FIELD.name = "pos"
BCESELLTOOL_POS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSellTool.pos"
BCESELLTOOL_POS_FIELD.number = 1
BCESELLTOOL_POS_FIELD.index = 0
BCESELLTOOL_POS_FIELD.label = 2
BCESELLTOOL_POS_FIELD.has_default_value = false
BCESELLTOOL_POS_FIELD.default_value = 0
BCESELLTOOL_POS_FIELD.type = 5
BCESELLTOOL_POS_FIELD.cpp_type = 1

BCESELLTOOL.name = "BceSellTool"
BCESELLTOOL.full_name = ".com.xinqihd.sns.gameserver.proto.BceSellTool"
BCESELLTOOL.nested_types = {}
BCESELLTOOL.enum_types = {}
BCESELLTOOL.fields = {BCESELLTOOL_POS_FIELD}
BCESELLTOOL.is_extendable = false
BCESELLTOOL.extensions = {}

BceSellTool = protobuf.Message(BCESELLTOOL)
_G.BCESELLTOOL_PB_BCESELLTOOL = BCESELLTOOL

