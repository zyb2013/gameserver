-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildInvite_pb', package.seeall)


local BSEGUILDINVITE = protobuf.Descriptor();
local BSEGUILDINVITE_STATUS_FIELD = protobuf.FieldDescriptor();
local BSEGUILDINVITE_MESSAGE_FIELD = protobuf.FieldDescriptor();

BSEGUILDINVITE_STATUS_FIELD.name = "status"
BSEGUILDINVITE_STATUS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildInvite.status"
BSEGUILDINVITE_STATUS_FIELD.number = 1
BSEGUILDINVITE_STATUS_FIELD.index = 0
BSEGUILDINVITE_STATUS_FIELD.label = 1
BSEGUILDINVITE_STATUS_FIELD.has_default_value = false
BSEGUILDINVITE_STATUS_FIELD.default_value = 0
BSEGUILDINVITE_STATUS_FIELD.type = 5
BSEGUILDINVITE_STATUS_FIELD.cpp_type = 1

BSEGUILDINVITE_MESSAGE_FIELD.name = "message"
BSEGUILDINVITE_MESSAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildInvite.message"
BSEGUILDINVITE_MESSAGE_FIELD.number = 2
BSEGUILDINVITE_MESSAGE_FIELD.index = 1
BSEGUILDINVITE_MESSAGE_FIELD.label = 1
BSEGUILDINVITE_MESSAGE_FIELD.has_default_value = false
BSEGUILDINVITE_MESSAGE_FIELD.default_value = ""
BSEGUILDINVITE_MESSAGE_FIELD.type = 9
BSEGUILDINVITE_MESSAGE_FIELD.cpp_type = 9

BSEGUILDINVITE.name = "BseGuildInvite"
BSEGUILDINVITE.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildInvite"
BSEGUILDINVITE.nested_types = {}
BSEGUILDINVITE.enum_types = {}
BSEGUILDINVITE.fields = {BSEGUILDINVITE_STATUS_FIELD, BSEGUILDINVITE_MESSAGE_FIELD}
BSEGUILDINVITE.is_extendable = false
BSEGUILDINVITE.extensions = {}

BseGuildInvite = protobuf.Message(BSEGUILDINVITE)
_G.BSEGUILDINVITE_PB_BSEGUILDINVITE = BSEGUILDINVITE

