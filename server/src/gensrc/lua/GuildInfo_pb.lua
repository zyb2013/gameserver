-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('GuildInfo_pb', package.seeall)


local GUILDINFO = protobuf.Descriptor();
local GUILDINFO_GUILDID_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_GUILDNAME_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_LEADERID_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_LEADERNAME_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_GUILDWEALTH_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_GUILDMEMBERCNT_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_GUILDLEVEL_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_GUILDCREDIT_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_ANNOUNCEMENTS_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_DECLARATION_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_ONLINE_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_OPFEE_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_SHOPLEVEL_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_IRONLEVEL_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_BAGLEVEL_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_MEMBERLIMIT_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_EXPRATIO_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_POSNAME_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_SHOPLIMIT_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_IRONLIMIT_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_BAGLIMIT_FIELD = protobuf.FieldDescriptor();
local GUILDINFO_RANK_FIELD = protobuf.FieldDescriptor();

GUILDINFO_GUILDID_FIELD.name = "guildID"
GUILDINFO_GUILDID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.guildID"
GUILDINFO_GUILDID_FIELD.number = 1
GUILDINFO_GUILDID_FIELD.index = 0
GUILDINFO_GUILDID_FIELD.label = 2
GUILDINFO_GUILDID_FIELD.has_default_value = false
GUILDINFO_GUILDID_FIELD.default_value = ""
GUILDINFO_GUILDID_FIELD.type = 9
GUILDINFO_GUILDID_FIELD.cpp_type = 9

GUILDINFO_GUILDNAME_FIELD.name = "guildName"
GUILDINFO_GUILDNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.guildName"
GUILDINFO_GUILDNAME_FIELD.number = 2
GUILDINFO_GUILDNAME_FIELD.index = 1
GUILDINFO_GUILDNAME_FIELD.label = 1
GUILDINFO_GUILDNAME_FIELD.has_default_value = false
GUILDINFO_GUILDNAME_FIELD.default_value = ""
GUILDINFO_GUILDNAME_FIELD.type = 9
GUILDINFO_GUILDNAME_FIELD.cpp_type = 9

GUILDINFO_LEADERID_FIELD.name = "leaderID"
GUILDINFO_LEADERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.leaderID"
GUILDINFO_LEADERID_FIELD.number = 3
GUILDINFO_LEADERID_FIELD.index = 2
GUILDINFO_LEADERID_FIELD.label = 1
GUILDINFO_LEADERID_FIELD.has_default_value = false
GUILDINFO_LEADERID_FIELD.default_value = ""
GUILDINFO_LEADERID_FIELD.type = 9
GUILDINFO_LEADERID_FIELD.cpp_type = 9

GUILDINFO_LEADERNAME_FIELD.name = "leaderName"
GUILDINFO_LEADERNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.leaderName"
GUILDINFO_LEADERNAME_FIELD.number = 4
GUILDINFO_LEADERNAME_FIELD.index = 3
GUILDINFO_LEADERNAME_FIELD.label = 1
GUILDINFO_LEADERNAME_FIELD.has_default_value = false
GUILDINFO_LEADERNAME_FIELD.default_value = ""
GUILDINFO_LEADERNAME_FIELD.type = 9
GUILDINFO_LEADERNAME_FIELD.cpp_type = 9

GUILDINFO_GUILDWEALTH_FIELD.name = "guildWealth"
GUILDINFO_GUILDWEALTH_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.guildWealth"
GUILDINFO_GUILDWEALTH_FIELD.number = 5
GUILDINFO_GUILDWEALTH_FIELD.index = 4
GUILDINFO_GUILDWEALTH_FIELD.label = 1
GUILDINFO_GUILDWEALTH_FIELD.has_default_value = false
GUILDINFO_GUILDWEALTH_FIELD.default_value = 0
GUILDINFO_GUILDWEALTH_FIELD.type = 5
GUILDINFO_GUILDWEALTH_FIELD.cpp_type = 1

GUILDINFO_GUILDMEMBERCNT_FIELD.name = "guildMemberCnt"
GUILDINFO_GUILDMEMBERCNT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.guildMemberCnt"
GUILDINFO_GUILDMEMBERCNT_FIELD.number = 6
GUILDINFO_GUILDMEMBERCNT_FIELD.index = 5
GUILDINFO_GUILDMEMBERCNT_FIELD.label = 1
GUILDINFO_GUILDMEMBERCNT_FIELD.has_default_value = false
GUILDINFO_GUILDMEMBERCNT_FIELD.default_value = 0
GUILDINFO_GUILDMEMBERCNT_FIELD.type = 13
GUILDINFO_GUILDMEMBERCNT_FIELD.cpp_type = 3

GUILDINFO_GUILDLEVEL_FIELD.name = "guildLevel"
GUILDINFO_GUILDLEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.guildLevel"
GUILDINFO_GUILDLEVEL_FIELD.number = 7
GUILDINFO_GUILDLEVEL_FIELD.index = 6
GUILDINFO_GUILDLEVEL_FIELD.label = 1
GUILDINFO_GUILDLEVEL_FIELD.has_default_value = false
GUILDINFO_GUILDLEVEL_FIELD.default_value = 0
GUILDINFO_GUILDLEVEL_FIELD.type = 13
GUILDINFO_GUILDLEVEL_FIELD.cpp_type = 3

GUILDINFO_GUILDCREDIT_FIELD.name = "guildCredit"
GUILDINFO_GUILDCREDIT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.guildCredit"
GUILDINFO_GUILDCREDIT_FIELD.number = 8
GUILDINFO_GUILDCREDIT_FIELD.index = 7
GUILDINFO_GUILDCREDIT_FIELD.label = 1
GUILDINFO_GUILDCREDIT_FIELD.has_default_value = false
GUILDINFO_GUILDCREDIT_FIELD.default_value = 0
GUILDINFO_GUILDCREDIT_FIELD.type = 13
GUILDINFO_GUILDCREDIT_FIELD.cpp_type = 3

GUILDINFO_ANNOUNCEMENTS_FIELD.name = "announcements"
GUILDINFO_ANNOUNCEMENTS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.announcements"
GUILDINFO_ANNOUNCEMENTS_FIELD.number = 9
GUILDINFO_ANNOUNCEMENTS_FIELD.index = 8
GUILDINFO_ANNOUNCEMENTS_FIELD.label = 1
GUILDINFO_ANNOUNCEMENTS_FIELD.has_default_value = false
GUILDINFO_ANNOUNCEMENTS_FIELD.default_value = ""
GUILDINFO_ANNOUNCEMENTS_FIELD.type = 9
GUILDINFO_ANNOUNCEMENTS_FIELD.cpp_type = 9

GUILDINFO_DECLARATION_FIELD.name = "declaration"
GUILDINFO_DECLARATION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.declaration"
GUILDINFO_DECLARATION_FIELD.number = 10
GUILDINFO_DECLARATION_FIELD.index = 9
GUILDINFO_DECLARATION_FIELD.label = 1
GUILDINFO_DECLARATION_FIELD.has_default_value = false
GUILDINFO_DECLARATION_FIELD.default_value = ""
GUILDINFO_DECLARATION_FIELD.type = 9
GUILDINFO_DECLARATION_FIELD.cpp_type = 9

GUILDINFO_ONLINE_FIELD.name = "online"
GUILDINFO_ONLINE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.online"
GUILDINFO_ONLINE_FIELD.number = 11
GUILDINFO_ONLINE_FIELD.index = 10
GUILDINFO_ONLINE_FIELD.label = 1
GUILDINFO_ONLINE_FIELD.has_default_value = false
GUILDINFO_ONLINE_FIELD.default_value = 0
GUILDINFO_ONLINE_FIELD.type = 13
GUILDINFO_ONLINE_FIELD.cpp_type = 3

GUILDINFO_OPFEE_FIELD.name = "opfee"
GUILDINFO_OPFEE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.opfee"
GUILDINFO_OPFEE_FIELD.number = 12
GUILDINFO_OPFEE_FIELD.index = 11
GUILDINFO_OPFEE_FIELD.label = 1
GUILDINFO_OPFEE_FIELD.has_default_value = false
GUILDINFO_OPFEE_FIELD.default_value = 0
GUILDINFO_OPFEE_FIELD.type = 13
GUILDINFO_OPFEE_FIELD.cpp_type = 3

GUILDINFO_SHOPLEVEL_FIELD.name = "shoplevel"
GUILDINFO_SHOPLEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.shoplevel"
GUILDINFO_SHOPLEVEL_FIELD.number = 21
GUILDINFO_SHOPLEVEL_FIELD.index = 12
GUILDINFO_SHOPLEVEL_FIELD.label = 1
GUILDINFO_SHOPLEVEL_FIELD.has_default_value = false
GUILDINFO_SHOPLEVEL_FIELD.default_value = 0
GUILDINFO_SHOPLEVEL_FIELD.type = 13
GUILDINFO_SHOPLEVEL_FIELD.cpp_type = 3

GUILDINFO_IRONLEVEL_FIELD.name = "ironlevel"
GUILDINFO_IRONLEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.ironlevel"
GUILDINFO_IRONLEVEL_FIELD.number = 22
GUILDINFO_IRONLEVEL_FIELD.index = 13
GUILDINFO_IRONLEVEL_FIELD.label = 1
GUILDINFO_IRONLEVEL_FIELD.has_default_value = false
GUILDINFO_IRONLEVEL_FIELD.default_value = 0
GUILDINFO_IRONLEVEL_FIELD.type = 13
GUILDINFO_IRONLEVEL_FIELD.cpp_type = 3

GUILDINFO_BAGLEVEL_FIELD.name = "baglevel"
GUILDINFO_BAGLEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.baglevel"
GUILDINFO_BAGLEVEL_FIELD.number = 23
GUILDINFO_BAGLEVEL_FIELD.index = 14
GUILDINFO_BAGLEVEL_FIELD.label = 1
GUILDINFO_BAGLEVEL_FIELD.has_default_value = false
GUILDINFO_BAGLEVEL_FIELD.default_value = 0
GUILDINFO_BAGLEVEL_FIELD.type = 13
GUILDINFO_BAGLEVEL_FIELD.cpp_type = 3

GUILDINFO_MEMBERLIMIT_FIELD.name = "memberlimit"
GUILDINFO_MEMBERLIMIT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.memberlimit"
GUILDINFO_MEMBERLIMIT_FIELD.number = 24
GUILDINFO_MEMBERLIMIT_FIELD.index = 15
GUILDINFO_MEMBERLIMIT_FIELD.label = 1
GUILDINFO_MEMBERLIMIT_FIELD.has_default_value = false
GUILDINFO_MEMBERLIMIT_FIELD.default_value = 0
GUILDINFO_MEMBERLIMIT_FIELD.type = 13
GUILDINFO_MEMBERLIMIT_FIELD.cpp_type = 3

GUILDINFO_EXPRATIO_FIELD.name = "expratio"
GUILDINFO_EXPRATIO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.expratio"
GUILDINFO_EXPRATIO_FIELD.number = 25
GUILDINFO_EXPRATIO_FIELD.index = 16
GUILDINFO_EXPRATIO_FIELD.label = 1
GUILDINFO_EXPRATIO_FIELD.has_default_value = false
GUILDINFO_EXPRATIO_FIELD.default_value = 0
GUILDINFO_EXPRATIO_FIELD.type = 13
GUILDINFO_EXPRATIO_FIELD.cpp_type = 3

GUILDINFO_POSNAME_FIELD.name = "posName"
GUILDINFO_POSNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.posName"
GUILDINFO_POSNAME_FIELD.number = 26
GUILDINFO_POSNAME_FIELD.index = 17
GUILDINFO_POSNAME_FIELD.label = 3
GUILDINFO_POSNAME_FIELD.has_default_value = false
GUILDINFO_POSNAME_FIELD.default_value = {}
GUILDINFO_POSNAME_FIELD.type = 9
GUILDINFO_POSNAME_FIELD.cpp_type = 9

GUILDINFO_SHOPLIMIT_FIELD.name = "shoplimit"
GUILDINFO_SHOPLIMIT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.shoplimit"
GUILDINFO_SHOPLIMIT_FIELD.number = 31
GUILDINFO_SHOPLIMIT_FIELD.index = 18
GUILDINFO_SHOPLIMIT_FIELD.label = 1
GUILDINFO_SHOPLIMIT_FIELD.has_default_value = false
GUILDINFO_SHOPLIMIT_FIELD.default_value = 0
GUILDINFO_SHOPLIMIT_FIELD.type = 13
GUILDINFO_SHOPLIMIT_FIELD.cpp_type = 3

GUILDINFO_IRONLIMIT_FIELD.name = "ironlimit"
GUILDINFO_IRONLIMIT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.ironlimit"
GUILDINFO_IRONLIMIT_FIELD.number = 32
GUILDINFO_IRONLIMIT_FIELD.index = 19
GUILDINFO_IRONLIMIT_FIELD.label = 1
GUILDINFO_IRONLIMIT_FIELD.has_default_value = false
GUILDINFO_IRONLIMIT_FIELD.default_value = 0
GUILDINFO_IRONLIMIT_FIELD.type = 13
GUILDINFO_IRONLIMIT_FIELD.cpp_type = 3

GUILDINFO_BAGLIMIT_FIELD.name = "baglimit"
GUILDINFO_BAGLIMIT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.baglimit"
GUILDINFO_BAGLIMIT_FIELD.number = 33
GUILDINFO_BAGLIMIT_FIELD.index = 20
GUILDINFO_BAGLIMIT_FIELD.label = 1
GUILDINFO_BAGLIMIT_FIELD.has_default_value = false
GUILDINFO_BAGLIMIT_FIELD.default_value = 0
GUILDINFO_BAGLIMIT_FIELD.type = 13
GUILDINFO_BAGLIMIT_FIELD.cpp_type = 3

GUILDINFO_RANK_FIELD.name = "rank"
GUILDINFO_RANK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo.rank"
GUILDINFO_RANK_FIELD.number = 34
GUILDINFO_RANK_FIELD.index = 21
GUILDINFO_RANK_FIELD.label = 1
GUILDINFO_RANK_FIELD.has_default_value = false
GUILDINFO_RANK_FIELD.default_value = 0
GUILDINFO_RANK_FIELD.type = 13
GUILDINFO_RANK_FIELD.cpp_type = 3

GUILDINFO.name = "GuildInfo"
GUILDINFO.full_name = ".com.xinqihd.sns.gameserver.proto.GuildInfo"
GUILDINFO.nested_types = {}
GUILDINFO.enum_types = {}
GUILDINFO.fields = {GUILDINFO_GUILDID_FIELD, GUILDINFO_GUILDNAME_FIELD, GUILDINFO_LEADERID_FIELD, GUILDINFO_LEADERNAME_FIELD, GUILDINFO_GUILDWEALTH_FIELD, GUILDINFO_GUILDMEMBERCNT_FIELD, GUILDINFO_GUILDLEVEL_FIELD, GUILDINFO_GUILDCREDIT_FIELD, GUILDINFO_ANNOUNCEMENTS_FIELD, GUILDINFO_DECLARATION_FIELD, GUILDINFO_ONLINE_FIELD, GUILDINFO_OPFEE_FIELD, GUILDINFO_SHOPLEVEL_FIELD, GUILDINFO_IRONLEVEL_FIELD, GUILDINFO_BAGLEVEL_FIELD, GUILDINFO_MEMBERLIMIT_FIELD, GUILDINFO_EXPRATIO_FIELD, GUILDINFO_POSNAME_FIELD, GUILDINFO_SHOPLIMIT_FIELD, GUILDINFO_IRONLIMIT_FIELD, GUILDINFO_BAGLIMIT_FIELD, GUILDINFO_RANK_FIELD}
GUILDINFO.is_extendable = false
GUILDINFO.extensions = {}

GuildInfo = protobuf.Message(GUILDINFO)
_G.GUILDINFO_PB_GUILDINFO = GUILDINFO

