// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseFillProfile.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseFillProfile {
  private XinqiBseFillProfile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseFillProfileOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 code = 1;
    boolean hasCode();
    int getCode();
    
    // optional string message = 2;
    boolean hasMessage();
    String getMessage();
  }
  public static final class BseFillProfile extends
      com.google.protobuf.GeneratedMessage
      implements BseFillProfileOrBuilder {
    // Use BseFillProfile.newBuilder() to construct.
    private BseFillProfile(Builder builder) {
      super(builder);
    }
    private BseFillProfile(boolean noInit) {}
    
    private static final BseFillProfile defaultInstance;
    public static BseFillProfile getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseFillProfile getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 code = 1;
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    public boolean hasCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getCode() {
      return code_;
    }
    
    // optional string message = 2;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          message_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      code_ = 0;
      message_ = "";
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
        output.writeInt32(1, code_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMessageBytes());
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
          .computeInt32Size(1, code_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMessageBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfileOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile.newBuilder()
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
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile result = new com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.code_ = code_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile.getDefaultInstance()) return this;
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
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
              code_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              message_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 code = 1;
      private int code_ ;
      public boolean hasCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getCode() {
        return code_;
      }
      public Builder setCode(int value) {
        bitField0_ |= 0x00000001;
        code_ = value;
        onChanged();
        return this;
      }
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        onChanged();
        return this;
      }
      
      // optional string message = 2;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMessage(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseFillProfile)
    }
    
    static {
      defaultInstance = new BseFillProfile(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseFillProfile)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BseFillProfile.proto\022 com.xinqihd.sns." +
      "gameserver.proto\"/\n\016BseFillProfile\022\014\n\004co" +
      "de\030\001 \001(\005\022\017\n\007message\030\002 \001(\tB\025B\023XinqiBseFil" +
      "lProfile"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseFillProfile_descriptor,
              new java.lang.String[] { "Code", "Message", },
              com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseFillProfile.BseFillProfile.Builder.class);
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
