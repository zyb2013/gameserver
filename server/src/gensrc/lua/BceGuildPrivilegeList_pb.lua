-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGuildPrivilegeList_pb', package.seeall)


local BCEGUILDPRIVILEGELIST = protobuf.Descriptor();
local BCEGUILDPRIVILEGELIST_GUILDID_FIELD = protobuf.FieldDescriptor();

BCEGUILDPRIVILEGELIST_GUILDID_FIELD.name = "guildID"
BCEGUILDPRIVILEGELIST_GUILDID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildPrivilegeList.guildID"
BCEGUILDPRIVILEGELIST_GUILDID_FIELD.number = 1
BCEGUILDPRIVILEGELIST_GUILDID_FIELD.index = 0
BCEGUILDPRIVILEGELIST_GUILDID_FIELD.label = 1
BCEGUILDPRIVILEGELIST_GUILDID_FIELD.has_default_value = false
BCEGUILDPRIVILEGELIST_GUILDID_FIELD.default_value = ""
BCEGUILDPRIVILEGELIST_GUILDID_FIELD.type = 9
BCEGUILDPRIVILEGELIST_GUILDID_FIELD.cpp_type = 9

BCEGUILDPRIVILEGELIST.name = "BceGuildPrivilegeList"
BCEGUILDPRIVILEGELIST.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildPrivilegeList"
BCEGUILDPRIVILEGELIST.nested_types = {}
BCEGUILDPRIVILEGELIST.enum_types = {}
BCEGUILDPRIVILEGELIST.fields = {BCEGUILDPRIVILEGELIST_GUILDID_FIELD}
BCEGUILDPRIVILEGELIST.is_extendable = false
BCEGUILDPRIVILEGELIST.extensions = {}

BceGuildPrivilegeList = protobuf.Message(BCEGUILDPRIVILEGELIST)
_G.BCEGUILDPRIVILEGELIST_PB_BCEGUILDPRIVILEGELIST = BCEGUILDPRIVILEGELIST

