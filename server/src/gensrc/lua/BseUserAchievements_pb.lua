-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseUserAchievements_pb', package.seeall)


local BSEUSERACHIEVEMENTS = protobuf.Descriptor();
local BSEUSERACHIEVEMENTS_TASKIDS_FIELD = protobuf.FieldDescriptor();
local BSEUSERACHIEVEMENTS_STEP_FIELD = protobuf.FieldDescriptor();

BSEUSERACHIEVEMENTS_TASKIDS_FIELD.name = "taskIds"
BSEUSERACHIEVEMENTS_TASKIDS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserAchievements.taskIds"
BSEUSERACHIEVEMENTS_TASKIDS_FIELD.number = 1
BSEUSERACHIEVEMENTS_TASKIDS_FIELD.index = 0
BSEUSERACHIEVEMENTS_TASKIDS_FIELD.label = 3
BSEUSERACHIEVEMENTS_TASKIDS_FIELD.has_default_value = false
BSEUSERACHIEVEMENTS_TASKIDS_FIELD.default_value = {}
BSEUSERACHIEVEMENTS_TASKIDS_FIELD.type = 9
BSEUSERACHIEVEMENTS_TASKIDS_FIELD.cpp_type = 9

BSEUSERACHIEVEMENTS_STEP_FIELD.name = "step"
BSEUSERACHIEVEMENTS_STEP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserAchievements.step"
BSEUSERACHIEVEMENTS_STEP_FIELD.number = 2
BSEUSERACHIEVEMENTS_STEP_FIELD.index = 1
BSEUSERACHIEVEMENTS_STEP_FIELD.label = 3
BSEUSERACHIEVEMENTS_STEP_FIELD.has_default_value = false
BSEUSERACHIEVEMENTS_STEP_FIELD.default_value = {}
BSEUSERACHIEVEMENTS_STEP_FIELD.type = 5
BSEUSERACHIEVEMENTS_STEP_FIELD.cpp_type = 1

BSEUSERACHIEVEMENTS.name = "BseUserAchievements"
BSEUSERACHIEVEMENTS.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserAchievements"
BSEUSERACHIEVEMENTS.nested_types = {}
BSEUSERACHIEVEMENTS.enum_types = {}
BSEUSERACHIEVEMENTS.fields = {BSEUSERACHIEVEMENTS_TASKIDS_FIELD, BSEUSERACHIEVEMENTS_STEP_FIELD}
BSEUSERACHIEVEMENTS.is_extendable = false
BSEUSERACHIEVEMENTS.extensions = {}

BseUserAchievements = protobuf.Message(BSEUSERACHIEVEMENTS)
_G.BSEUSERACHIEVEMENTS_PB_BSEUSERACHIEVEMENTS = BSEUSERACHIEVEMENTS

