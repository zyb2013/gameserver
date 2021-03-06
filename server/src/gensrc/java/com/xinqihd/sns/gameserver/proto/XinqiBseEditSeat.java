// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseEditSeat.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseEditSeat {
  private XinqiBseEditSeat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseEditSeatOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string sessionID = 1;
    boolean hasSessionID();
    String getSessionID();
    
    // required int32 index = 2;
    boolean hasIndex();
    int getIndex();
    
    // required bool open = 3;
    boolean hasOpen();
    boolean getOpen();
  }
  public static final class BseEditSeat extends
      com.google.protobuf.GeneratedMessage
      implements BseEditSeatOrBuilder {
    // Use BseEditSeat.newBuilder() to construct.
    private BseEditSeat(Builder builder) {
      super(builder);
    }
    private BseEditSeat(boolean noInit) {}
    
    private static final BseEditSeat defaultInstance;
    public static BseEditSeat getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseEditSeat getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string sessionID = 1;
    public static final int SESSIONID_FIELD_NUMBER = 1;
    private java.lang.Object sessionID_;
    public boolean hasSessionID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getSessionID() {
      java.lang.Object ref = sessionID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          sessionID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSessionIDBytes() {
      java.lang.Object ref = sessionID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        sessionID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 index = 2;
    public static final int INDEX_FIELD_NUMBER = 2;
    private int index_;
    public boolean hasIndex() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getIndex() {
      return index_;
    }
    
    // required bool open = 3;
    public static final int OPEN_FIELD_NUMBER = 3;
    private boolean open_;
    public boolean hasOpen() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public boolean getOpen() {
      return open_;
    }
    
    private void initFields() {
      sessionID_ = "";
      index_ = 0;
      open_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSessionID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpen()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSessionIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, index_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, open_);
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
          .computeBytesSize(1, getSessionIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, index_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, open_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat.newBuilder()
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
        sessionID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        index_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        open_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat result = new com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sessionID_ = sessionID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.index_ = index_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.open_ = open_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat.getDefaultInstance()) return this;
        if (other.hasSessionID()) {
          setSessionID(other.getSessionID());
        }
        if (other.hasIndex()) {
          setIndex(other.getIndex());
        }
        if (other.hasOpen()) {
          setOpen(other.getOpen());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSessionID()) {
          
          return false;
        }
        if (!hasIndex()) {
          
          return false;
        }
        if (!hasOpen()) {
          
          return false;
        }
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
            case 10: {
              bitField0_ |= 0x00000001;
              sessionID_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              index_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              open_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string sessionID = 1;
      private java.lang.Object sessionID_ = "";
      public boolean hasSessionID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getSessionID() {
        java.lang.Object ref = sessionID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          sessionID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSessionID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        sessionID_ = value;
        onChanged();
        return this;
      }
      public Builder clearSessionID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionID_ = getDefaultInstance().getSessionID();
        onChanged();
        return this;
      }
      void setSessionID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        sessionID_ = value;
        onChanged();
      }
      
      // required int32 index = 2;
      private int index_ ;
      public boolean hasIndex() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getIndex() {
        return index_;
      }
      public Builder setIndex(int value) {
        bitField0_ |= 0x00000002;
        index_ = value;
        onChanged();
        return this;
      }
      public Builder clearIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        index_ = 0;
        onChanged();
        return this;
      }
      
      // required bool open = 3;
      private boolean open_ ;
      public boolean hasOpen() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public boolean getOpen() {
        return open_;
      }
      public Builder setOpen(boolean value) {
        bitField0_ |= 0x00000004;
        open_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpen() {
        bitField0_ = (bitField0_ & ~0x00000004);
        open_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseEditSeat)
    }
    
    static {
      defaultInstance = new BseEditSeat(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseEditSeat)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BseEditSeat.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\"=\n\013BseEditSeat\022\021\n\tsessionI" +
      "D\030\001 \002(\t\022\r\n\005index\030\002 \002(\005\022\014\n\004open\030\003 \002(\010B\022B\020" +
      "XinqiBseEditSeat"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseEditSeat_descriptor,
              new java.lang.String[] { "SessionID", "Index", "Open", },
              com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseEditSeat.BseEditSeat.Builder.class);
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
