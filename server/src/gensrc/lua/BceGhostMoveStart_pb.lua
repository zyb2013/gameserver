-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGhostMoveStart_pb', package.seeall)


local BCEGHOSTMOVESTART = protobuf.Descriptor();
local BCEGHOSTMOVESTART_STARTX_FIELD = protobuf.FieldDescriptor();
local BCEGHOSTMOVESTART_STARTY_FIELD = protobuf.FieldDescriptor();
local BCEGHOSTMOVESTART_ENDX_FIELD = protobuf.FieldDescriptor();
local BCEGHOSTMOVESTART_ENDY_FIELD = protobuf.FieldDescriptor();

BCEGHOSTMOVESTART_STARTX_FIELD.name = "startx"
BCEGHOSTMOVESTART_STARTX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGhostMoveStart.startx"
BCEGHOSTMOVESTART_STARTX_FIELD.number = 1
BCEGHOSTMOVESTART_STARTX_FIELD.index = 0
BCEGHOSTMOVESTART_STARTX_FIELD.label = 2
BCEGHOSTMOVESTART_STARTX_FIELD.has_default_value = false
BCEGHOSTMOVESTART_STARTX_FIELD.default_value = 0
BCEGHOSTMOVESTART_STARTX_FIELD.type = 5
BCEGHOSTMOVESTART_STARTX_FIELD.cpp_type = 1

BCEGHOSTMOVESTART_STARTY_FIELD.name = "starty"
BCEGHOSTMOVESTART_STARTY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGhostMoveStart.starty"
BCEGHOSTMOVESTART_STARTY_FIELD.number = 2
BCEGHOSTMOVESTART_STARTY_FIELD.index = 1
BCEGHOSTMOVESTART_STARTY_FIELD.label = 2
BCEGHOSTMOVESTART_STARTY_FIELD.has_default_value = false
BCEGHOSTMOVESTART_STARTY_FIELD.default_value = 0
BCEGHOSTMOVESTART_STARTY_FIELD.type = 5
BCEGHOSTMOVESTART_STARTY_FIELD.cpp_type = 1

BCEGHOSTMOVESTART_ENDX_FIELD.name = "endx"
BCEGHOSTMOVESTART_ENDX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGhostMoveStart.endx"
BCEGHOSTMOVESTART_ENDX_FIELD.number = 3
BCEGHOSTMOVESTART_ENDX_FIELD.index = 2
BCEGHOSTMOVESTART_ENDX_FIELD.label = 2
BCEGHOSTMOVESTART_ENDX_FIELD.has_default_value = false
BCEGHOSTMOVESTART_ENDX_FIELD.default_value = 0
BCEGHOSTMOVESTART_ENDX_FIELD.type = 5
BCEGHOSTMOVESTART_ENDX_FIELD.cpp_type = 1

BCEGHOSTMOVESTART_ENDY_FIELD.name = "endy"
BCEGHOSTMOVESTART_ENDY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGhostMoveStart.endy"
BCEGHOSTMOVESTART_ENDY_FIELD.number = 4
BCEGHOSTMOVESTART_ENDY_FIELD.index = 3
BCEGHOSTMOVESTART_ENDY_FIELD.label = 2
BCEGHOSTMOVESTART_ENDY_FIELD.has_default_value = false
BCEGHOSTMOVESTART_ENDY_FIELD.default_value = 0
BCEGHOSTMOVESTART_ENDY_FIELD.type = 5
BCEGHOSTMOVESTART_ENDY_FIELD.cpp_type = 1

BCEGHOSTMOVESTART.name = "BceGhostMoveStart"
BCEGHOSTMOVESTART.full_name = ".com.xinqihd.sns.gameserver.proto.BceGhostMoveStart"
BCEGHOSTMOVESTART.nested_types = {}
BCEGHOSTMOVESTART.enum_types = {}
BCEGHOSTMOVESTART.fields = {BCEGHOSTMOVESTART_STARTX_FIELD, BCEGHOSTMOVESTART_STARTY_FIELD, BCEGHOSTMOVESTART_ENDX_FIELD, BCEGHOSTMOVESTART_ENDY_FIELD}
BCEGHOSTMOVESTART.is_extendable = false
BCEGHOSTMOVESTART.extensions = {}

BceGhostMoveStart = protobuf.Message(BCEGHOSTMOVESTART)
_G.BCEGHOSTMOVESTART_PB_BCEGHOSTMOVESTART = BCEGHOSTMOVESTART
