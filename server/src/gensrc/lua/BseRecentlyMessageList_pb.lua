-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseRecentlyMessageList_pb', package.seeall)


local BSERECENTLYMESSAGELIST = protobuf.Descriptor();
local BSERECENTLYMESSAGELIST_MESSAGES_FIELD = protobuf.FieldDescriptor();

BSERECENTLYMESSAGELIST_MESSAGES_FIELD.name = "messages"
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRecentlyMessageList.messages"
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.number = 1
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.index = 0
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.label = 3
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.has_default_value = false
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.default_value = {}
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.message_type = LEAVEMESSAGE_PB_LEAVEMESSAGE
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.type = 11
BSERECENTLYMESSAGELIST_MESSAGES_FIELD.cpp_type = 10

BSERECENTLYMESSAGELIST.name = "BseRecentlyMessageList"
BSERECENTLYMESSAGELIST.full_name = ".com.xinqihd.sns.gameserver.proto.BseRecentlyMessageList"
BSERECENTLYMESSAGELIST.nested_types = {}
BSERECENTLYMESSAGELIST.enum_types = {}
BSERECENTLYMESSAGELIST.fields = {BSERECENTLYMESSAGELIST_MESSAGES_FIELD}
BSERECENTLYMESSAGELIST.is_extendable = false
BSERECENTLYMESSAGELIST.extensions = {}

BseRecentlyMessageList = protobuf.Message(BSERECENTLYMESSAGELIST)
_G.BSERECENTLYMESSAGELIST_PB_BSERECENTLYMESSAGELIST = BSERECENTLYMESSAGELIST

