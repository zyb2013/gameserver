-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceCraftPrice_pb', package.seeall)


local BCECRAFTPRICE = protobuf.Descriptor();
local BCECRAFTPRICE_ACTION_FIELD = protobuf.FieldDescriptor();
local BCECRAFTPRICE_PEW_FIELD = protobuf.FieldDescriptor();
local BCECRAFTPRICE_AUXPEW_FIELD = protobuf.FieldDescriptor();

BCECRAFTPRICE_ACTION_FIELD.name = "action"
BCECRAFTPRICE_ACTION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceCraftPrice.action"
BCECRAFTPRICE_ACTION_FIELD.number = 1
BCECRAFTPRICE_ACTION_FIELD.index = 0
BCECRAFTPRICE_ACTION_FIELD.label = 1
BCECRAFTPRICE_ACTION_FIELD.has_default_value = false
BCECRAFTPRICE_ACTION_FIELD.default_value = 0
BCECRAFTPRICE_ACTION_FIELD.type = 5
BCECRAFTPRICE_ACTION_FIELD.cpp_type = 1

BCECRAFTPRICE_PEW_FIELD.name = "pew"
BCECRAFTPRICE_PEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceCraftPrice.pew"
BCECRAFTPRICE_PEW_FIELD.number = 2
BCECRAFTPRICE_PEW_FIELD.index = 1
BCECRAFTPRICE_PEW_FIELD.label = 1
BCECRAFTPRICE_PEW_FIELD.has_default_value = false
BCECRAFTPRICE_PEW_FIELD.default_value = 0
BCECRAFTPRICE_PEW_FIELD.type = 5
BCECRAFTPRICE_PEW_FIELD.cpp_type = 1

BCECRAFTPRICE_AUXPEW_FIELD.name = "auxpew"
BCECRAFTPRICE_AUXPEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceCraftPrice.auxpew"
BCECRAFTPRICE_AUXPEW_FIELD.number = 3
BCECRAFTPRICE_AUXPEW_FIELD.index = 2
BCECRAFTPRICE_AUXPEW_FIELD.label = 3
BCECRAFTPRICE_AUXPEW_FIELD.has_default_value = false
BCECRAFTPRICE_AUXPEW_FIELD.default_value = {}
BCECRAFTPRICE_AUXPEW_FIELD.type = 5
BCECRAFTPRICE_AUXPEW_FIELD.cpp_type = 1

BCECRAFTPRICE.name = "BceCraftPrice"
BCECRAFTPRICE.full_name = ".com.xinqihd.sns.gameserver.proto.BceCraftPrice"
BCECRAFTPRICE.nested_types = {}
BCECRAFTPRICE.enum_types = {}
BCECRAFTPRICE.fields = {BCECRAFTPRICE_ACTION_FIELD, BCECRAFTPRICE_PEW_FIELD, BCECRAFTPRICE_AUXPEW_FIELD}
BCECRAFTPRICE.is_extendable = false
BCECRAFTPRICE.extensions = {}

BceCraftPrice = protobuf.Message(BCECRAFTPRICE)
_G.BCECRAFTPRICE_PB_BCECRAFTPRICE = BCECRAFTPRICE
