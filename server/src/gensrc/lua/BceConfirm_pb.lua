-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceConfirm_pb', package.seeall)


local BCECONFIRM = protobuf.Descriptor();
local BCECONFIRM_SELECTED_FIELD = protobuf.FieldDescriptor();
local BCECONFIRM_TYPE_FIELD = protobuf.FieldDescriptor();
local BCECONFIRM_USERSESSION_FIELD = protobuf.FieldDescriptor();

BCECONFIRM_SELECTED_FIELD.name = "selected"
BCECONFIRM_SELECTED_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceConfirm.selected"
BCECONFIRM_SELECTED_FIELD.number = 1
BCECONFIRM_SELECTED_FIELD.index = 0
BCECONFIRM_SELECTED_FIELD.label = 2
BCECONFIRM_SELECTED_FIELD.has_default_value = false
BCECONFIRM_SELECTED_FIELD.default_value = 0
BCECONFIRM_SELECTED_FIELD.type = 5
BCECONFIRM_SELECTED_FIELD.cpp_type = 1

BCECONFIRM_TYPE_FIELD.name = "type"
BCECONFIRM_TYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceConfirm.type"
BCECONFIRM_TYPE_FIELD.number = 2
BCECONFIRM_TYPE_FIELD.index = 1
BCECONFIRM_TYPE_FIELD.label = 2
BCECONFIRM_TYPE_FIELD.has_default_value = false
BCECONFIRM_TYPE_FIELD.default_value = ""
BCECONFIRM_TYPE_FIELD.type = 9
BCECONFIRM_TYPE_FIELD.cpp_type = 9

BCECONFIRM_USERSESSION_FIELD.name = "usersession"
BCECONFIRM_USERSESSION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceConfirm.usersession"
BCECONFIRM_USERSESSION_FIELD.number = 3
BCECONFIRM_USERSESSION_FIELD.index = 2
BCECONFIRM_USERSESSION_FIELD.label = 1
BCECONFIRM_USERSESSION_FIELD.has_default_value = false
BCECONFIRM_USERSESSION_FIELD.default_value = ""
BCECONFIRM_USERSESSION_FIELD.type = 9
BCECONFIRM_USERSESSION_FIELD.cpp_type = 9

BCECONFIRM.name = "BceConfirm"
BCECONFIRM.full_name = ".com.xinqihd.sns.gameserver.proto.BceConfirm"
BCECONFIRM.nested_types = {}
BCECONFIRM.enum_types = {}
BCECONFIRM.fields = {BCECONFIRM_SELECTED_FIELD, BCECONFIRM_TYPE_FIELD, BCECONFIRM_USERSESSION_FIELD}
BCECONFIRM.is_extendable = false
BCECONFIRM.extensions = {}

BceConfirm = protobuf.Message(BCECONFIRM)
_G.BCECONFIRM_PB_BCECONFIRM = BCECONFIRM
