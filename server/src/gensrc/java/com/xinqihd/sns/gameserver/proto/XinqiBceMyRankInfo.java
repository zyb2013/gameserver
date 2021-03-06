// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceMyRankInfo.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceMyRankInfo {
  private XinqiBceMyRankInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceMyRankInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 rankType = 1 [default = 0];
    boolean hasRankType();
    int getRankType();
    
    // optional int32 arrangeType = 2 [default = 0];
    boolean hasArrangeType();
    int getArrangeType();
    
    // optional int32 filterType = 3 [default = 0];
    boolean hasFilterType();
    int getFilterType();
  }
  public static final class BceMyRankInfo extends
      com.google.protobuf.GeneratedMessage
      implements BceMyRankInfoOrBuilder {
    // Use BceMyRankInfo.newBuilder() to construct.
    private BceMyRankInfo(Builder builder) {
      super(builder);
    }
    private BceMyRankInfo(boolean noInit) {}
    
    private static final BceMyRankInfo defaultInstance;
    public static BceMyRankInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceMyRankInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 rankType = 1 [default = 0];
    public static final int RANKTYPE_FIELD_NUMBER = 1;
    private int rankType_;
    public boolean hasRankType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getRankType() {
      return rankType_;
    }
    
    // optional int32 arrangeType = 2 [default = 0];
    public static final int ARRANGETYPE_FIELD_NUMBER = 2;
    private int arrangeType_;
    public boolean hasArrangeType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getArrangeType() {
      return arrangeType_;
    }
    
    // optional int32 filterType = 3 [default = 0];
    public static final int FILTERTYPE_FIELD_NUMBER = 3;
    private int filterType_;
    public boolean hasFilterType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getFilterType() {
      return filterType_;
    }
    
    private void initFields() {
      rankType_ = 0;
      arrangeType_ = 0;
      filterType_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, rankType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, arrangeType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, filterType_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, rankType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, arrangeType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, filterType_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        rankType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        arrangeType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        filterType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo result = new com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rankType_ = rankType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.arrangeType_ = arrangeType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.filterType_ = filterType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo.getDefaultInstance()) return this;
        if (other.hasRankType()) {
          setRankType(other.getRankType());
        }
        if (other.hasArrangeType()) {
          setArrangeType(other.getArrangeType());
        }
        if (other.hasFilterType()) {
          setFilterType(other.getFilterType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              rankType_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              arrangeType_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              filterType_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 rankType = 1 [default = 0];
      private int rankType_ ;
      public boolean hasRankType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getRankType() {
        return rankType_;
      }
      public Builder setRankType(int value) {
        bitField0_ |= 0x00000001;
        rankType_ = value;
        onChanged();
        return this;
      }
      public Builder clearRankType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rankType_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 arrangeType = 2 [default = 0];
      private int arrangeType_ ;
      public boolean hasArrangeType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getArrangeType() {
        return arrangeType_;
      }
      public Builder setArrangeType(int value) {
        bitField0_ |= 0x00000002;
        arrangeType_ = value;
        onChanged();
        return this;
      }
      public Builder clearArrangeType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        arrangeType_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 filterType = 3 [default = 0];
      private int filterType_ ;
      public boolean hasFilterType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getFilterType() {
        return filterType_;
      }
      public Builder setFilterType(int value) {
        bitField0_ |= 0x00000004;
        filterType_ = value;
        onChanged();
        return this;
      }
      public Builder clearFilterType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        filterType_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceMyRankInfo)
    }
    
    static {
      defaultInstance = new BceMyRankInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceMyRankInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BceMyRankInfo.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\"S\n\rBceMyRankInfo\022\023\n\010rank" +
      "Type\030\001 \001(\005:\0010\022\026\n\013arrangeType\030\002 \001(\005:\0010\022\025\n" +
      "\nfilterType\030\003 \001(\005:\0010B\024B\022XinqiBceMyRankIn" +
      "fo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceMyRankInfo_descriptor,
              new java.lang.String[] { "RankType", "ArrangeType", "FilterType", },
              com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceMyRankInfo.BceMyRankInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
