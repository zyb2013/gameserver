-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGuildChangeRole_pb', package.seeall)


local BCEGUILDCHANGEROLE = protobuf.Descriptor();
local BCEGUILDCHANGEROLE_USERID_FIELD = protobuf.FieldDescriptor();
local BCEGUILDCHANGEROLE_TARGETROLE_FIELD = protobuf.FieldDescriptor();

BCEGUILDCHANGEROLE_USERID_FIELD.name = "userid"
BCEGUILDCHANGEROLE_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildChangeRole.userid"
BCEGUILDCHANGEROLE_USERID_FIELD.number = 1
BCEGUILDCHANGEROLE_USERID_FIELD.index = 0
BCEGUILDCHANGEROLE_USERID_FIELD.label = 1
BCEGUILDCHANGEROLE_USERID_FIELD.has_default_value = false
BCEGUILDCHANGEROLE_USERID_FIELD.default_value = ""
BCEGUILDCHANGEROLE_USERID_FIELD.type = 9
BCEGUILDCHANGEROLE_USERID_FIELD.cpp_type = 9

BCEGUILDCHANGEROLE_TARGETROLE_FIELD.name = "targetrole"
BCEGUILDCHANGEROLE_TARGETROLE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildChangeRole.targetrole"
BCEGUILDCHANGEROLE_TARGETROLE_FIELD.number = 2
BCEGUILDCHANGEROLE_TARGETROLE_FIELD.index = 1
BCEGUILDCHANGEROLE_TARGETROLE_FIELD.label = 1
BCEGUILDCHANGEROLE_TARGETROLE_FIELD.has_default_value = false
BCEGUILDCHANGEROLE_TARGETROLE_FIELD.default_value = ""
BCEGUILDCHANGEROLE_TARGETROLE_FIELD.type = 9
BCEGUILDCHANGEROLE_TARGETROLE_FIELD.cpp_type = 9

BCEGUILDCHANGEROLE.name = "BceGuildChangeRole"
BCEGUILDCHANGEROLE.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildChangeRole"
BCEGUILDCHANGEROLE.nested_types = {}
BCEGUILDCHANGEROLE.enum_types = {}
BCEGUILDCHANGEROLE.fields = {BCEGUILDCHANGEROLE_USERID_FIELD, BCEGUILDCHANGEROLE_TARGETROLE_FIELD}
BCEGUILDCHANGEROLE.is_extendable = false
BCEGUILDCHANGEROLE.extensions = {}

BceGuildChangeRole = protobuf.Message(BCEGUILDCHANGEROLE)
_G.BCEGUILDCHANGEROLE_PB_BCEGUILDCHANGEROLE = BCEGUILDCHANGEROLE
