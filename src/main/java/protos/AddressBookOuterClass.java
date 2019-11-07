package protos;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddressBook.proto

public final class AddressBookOuterClass {
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AddressBook_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AddressBook_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\021AddressBook.proto\032\017BuddyInfo.proto\",\n\013" +
                        "AddressBook\022\035\n\tbuddyInfo\030\001 \003(\0132\n.BuddyIn" +
                        "fob\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                BuddyInfoOuterClass.getDescriptor(),
                        });
        internal_static_AddressBook_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_AddressBook_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_AddressBook_descriptor,
                new String[]{"BuddyInfo",});
        BuddyInfoOuterClass.getDescriptor();
    }

    private AddressBookOuterClass() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    public interface AddressBookOrBuilder extends
            // @@protoc_insertion_point(interface_extends:AddressBook)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        java.util.List<BuddyInfoOuterClass.BuddyInfo>
        getBuddyInfoList();

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        BuddyInfoOuterClass.BuddyInfo getBuddyInfo(int index);

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        int getBuddyInfoCount();

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        java.util.List<? extends BuddyInfoOuterClass.BuddyInfoOrBuilder>
        getBuddyInfoOrBuilderList();

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        BuddyInfoOuterClass.BuddyInfoOrBuilder getBuddyInfoOrBuilder(
                int index);
    }

    /**
     * Protobuf type {@code AddressBook}
     */
    public static final class AddressBook extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:AddressBook)
            AddressBookOrBuilder {
        public static final int BUDDYINFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:AddressBook)
        private static final AddressBook DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<AddressBook>
                PARSER = new com.google.protobuf.AbstractParser<AddressBook>() {
            @Override
            public AddressBook parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new AddressBook(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AddressBook();
        }

        private java.util.List<BuddyInfoOuterClass.BuddyInfo> buddyInfo_;
        private byte memoizedIsInitialized = -1;

        // Use AddressBook.newBuilder() to construct.
        private AddressBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private AddressBook() {
            buddyInfo_ = java.util.Collections.emptyList();
        }

        private AddressBook(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                buddyInfo_ = new java.util.ArrayList<BuddyInfoOuterClass.BuddyInfo>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            buddyInfo_.add(
                                    input.readMessage(BuddyInfoOuterClass.BuddyInfo.parser(), extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    buddyInfo_ = java.util.Collections.unmodifiableList(buddyInfo_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return AddressBookOuterClass.internal_static_AddressBook_descriptor;
        }

        public static AddressBook parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AddressBook parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AddressBook parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AddressBook parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AddressBook parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AddressBook parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AddressBook parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static AddressBook parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AddressBook parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static AddressBook parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AddressBook parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static AddressBook parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AddressBook prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AddressBook getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<AddressBook> parser() {
            return PARSER;
        }

        @Override
        @SuppressWarnings({"unused"})
        protected Object newInstance(
                UnusedPrivateParameter unused) {
            return new AddressBook();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return AddressBookOuterClass.internal_static_AddressBook_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            AddressBook.class, Builder.class);
        }

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        public java.util.List<BuddyInfoOuterClass.BuddyInfo> getBuddyInfoList() {
            return buddyInfo_;
        }

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        public java.util.List<? extends BuddyInfoOuterClass.BuddyInfoOrBuilder>
        getBuddyInfoOrBuilderList() {
            return buddyInfo_;
        }

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        public int getBuddyInfoCount() {
            return buddyInfo_.size();
        }

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        public BuddyInfoOuterClass.BuddyInfo getBuddyInfo(int index) {
            return buddyInfo_.get(index);
        }

        /**
         * <code>repeated .BuddyInfo buddyInfo = 1;</code>
         */
        public BuddyInfoOuterClass.BuddyInfoOrBuilder getBuddyInfoOrBuilder(
                int index) {
            return buddyInfo_.get(index);
        }

        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < buddyInfo_.size(); i++) {
                output.writeMessage(1, buddyInfo_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < buddyInfo_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, buddyInfo_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AddressBook)) {
                return super.equals(obj);
            }
            AddressBook other = (AddressBook) obj;

            if (!getBuddyInfoList()
                    .equals(other.getBuddyInfoList())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getBuddyInfoCount() > 0) {
                hash = (37 * hash) + BUDDYINFO_FIELD_NUMBER;
                hash = (53 * hash) + getBuddyInfoList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<AddressBook> getParserForType() {
            return PARSER;
        }

        @Override
        public AddressBook getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code AddressBook}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:AddressBook)
                AddressBookOrBuilder {
            private int bitField0_;
            private java.util.List<BuddyInfoOuterClass.BuddyInfo> buddyInfo_ =
                    java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    BuddyInfoOuterClass.BuddyInfo, BuddyInfoOuterClass.BuddyInfo.Builder, BuddyInfoOuterClass.BuddyInfoOrBuilder> buddyInfoBuilder_;

            // Construct using AddressBookOuterClass.AddressBook.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return AddressBookOuterClass.internal_static_AddressBook_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return AddressBookOuterClass.internal_static_AddressBook_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                AddressBook.class, Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getBuddyInfoFieldBuilder();
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                if (buddyInfoBuilder_ == null) {
                    buddyInfo_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    buddyInfoBuilder_.clear();
                }
                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return AddressBookOuterClass.internal_static_AddressBook_descriptor;
            }

            @Override
            public AddressBook getDefaultInstanceForType() {
                return AddressBook.getDefaultInstance();
            }

            @Override
            public AddressBook build() {
                AddressBook result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public AddressBook buildPartial() {
                AddressBook result = new AddressBook(this);
                int from_bitField0_ = bitField0_;
                if (buddyInfoBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        buddyInfo_ = java.util.Collections.unmodifiableList(buddyInfo_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.buddyInfo_ = buddyInfo_;
                } else {
                    result.buddyInfo_ = buddyInfoBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AddressBook) {
                    return mergeFrom((AddressBook) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AddressBook other) {
                if (other == AddressBook.getDefaultInstance()) return this;
                if (buddyInfoBuilder_ == null) {
                    if (!other.buddyInfo_.isEmpty()) {
                        if (buddyInfo_.isEmpty()) {
                            buddyInfo_ = other.buddyInfo_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureBuddyInfoIsMutable();
                            buddyInfo_.addAll(other.buddyInfo_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.buddyInfo_.isEmpty()) {
                        if (buddyInfoBuilder_.isEmpty()) {
                            buddyInfoBuilder_.dispose();
                            buddyInfoBuilder_ = null;
                            buddyInfo_ = other.buddyInfo_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            buddyInfoBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getBuddyInfoFieldBuilder() : null;
                        } else {
                            buddyInfoBuilder_.addAllMessages(other.buddyInfo_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                AddressBook parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AddressBook) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private void ensureBuddyInfoIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    buddyInfo_ = new java.util.ArrayList<BuddyInfoOuterClass.BuddyInfo>(buddyInfo_);
                    bitField0_ |= 0x00000001;
                }
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public java.util.List<BuddyInfoOuterClass.BuddyInfo> getBuddyInfoList() {
                if (buddyInfoBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(buddyInfo_);
                } else {
                    return buddyInfoBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public int getBuddyInfoCount() {
                if (buddyInfoBuilder_ == null) {
                    return buddyInfo_.size();
                } else {
                    return buddyInfoBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public BuddyInfoOuterClass.BuddyInfo getBuddyInfo(int index) {
                if (buddyInfoBuilder_ == null) {
                    return buddyInfo_.get(index);
                } else {
                    return buddyInfoBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder setBuddyInfo(
                    int index, BuddyInfoOuterClass.BuddyInfo value) {
                if (buddyInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBuddyInfoIsMutable();
                    buddyInfo_.set(index, value);
                    onChanged();
                } else {
                    buddyInfoBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder setBuddyInfo(
                    int index, BuddyInfoOuterClass.BuddyInfo.Builder builderForValue) {
                if (buddyInfoBuilder_ == null) {
                    ensureBuddyInfoIsMutable();
                    buddyInfo_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    buddyInfoBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder addBuddyInfo(BuddyInfoOuterClass.BuddyInfo value) {
                if (buddyInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBuddyInfoIsMutable();
                    buddyInfo_.add(value);
                    onChanged();
                } else {
                    buddyInfoBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder addBuddyInfo(
                    int index, BuddyInfoOuterClass.BuddyInfo value) {
                if (buddyInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBuddyInfoIsMutable();
                    buddyInfo_.add(index, value);
                    onChanged();
                } else {
                    buddyInfoBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder addBuddyInfo(
                    BuddyInfoOuterClass.BuddyInfo.Builder builderForValue) {
                if (buddyInfoBuilder_ == null) {
                    ensureBuddyInfoIsMutable();
                    buddyInfo_.add(builderForValue.build());
                    onChanged();
                } else {
                    buddyInfoBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder addBuddyInfo(
                    int index, BuddyInfoOuterClass.BuddyInfo.Builder builderForValue) {
                if (buddyInfoBuilder_ == null) {
                    ensureBuddyInfoIsMutable();
                    buddyInfo_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    buddyInfoBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder addAllBuddyInfo(
                    Iterable<? extends BuddyInfoOuterClass.BuddyInfo> values) {
                if (buddyInfoBuilder_ == null) {
                    ensureBuddyInfoIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, buddyInfo_);
                    onChanged();
                } else {
                    buddyInfoBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder clearBuddyInfo() {
                if (buddyInfoBuilder_ == null) {
                    buddyInfo_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    buddyInfoBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public Builder removeBuddyInfo(int index) {
                if (buddyInfoBuilder_ == null) {
                    ensureBuddyInfoIsMutable();
                    buddyInfo_.remove(index);
                    onChanged();
                } else {
                    buddyInfoBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public BuddyInfoOuterClass.BuddyInfo.Builder getBuddyInfoBuilder(
                    int index) {
                return getBuddyInfoFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public BuddyInfoOuterClass.BuddyInfoOrBuilder getBuddyInfoOrBuilder(
                    int index) {
                if (buddyInfoBuilder_ == null) {
                    return buddyInfo_.get(index);
                } else {
                    return buddyInfoBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public java.util.List<? extends BuddyInfoOuterClass.BuddyInfoOrBuilder>
            getBuddyInfoOrBuilderList() {
                if (buddyInfoBuilder_ != null) {
                    return buddyInfoBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(buddyInfo_);
                }
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public BuddyInfoOuterClass.BuddyInfo.Builder addBuddyInfoBuilder() {
                return getBuddyInfoFieldBuilder().addBuilder(
                        BuddyInfoOuterClass.BuddyInfo.getDefaultInstance());
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public BuddyInfoOuterClass.BuddyInfo.Builder addBuddyInfoBuilder(
                    int index) {
                return getBuddyInfoFieldBuilder().addBuilder(
                        index, BuddyInfoOuterClass.BuddyInfo.getDefaultInstance());
            }

            /**
             * <code>repeated .BuddyInfo buddyInfo = 1;</code>
             */
            public java.util.List<BuddyInfoOuterClass.BuddyInfo.Builder>
            getBuddyInfoBuilderList() {
                return getBuddyInfoFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    BuddyInfoOuterClass.BuddyInfo, BuddyInfoOuterClass.BuddyInfo.Builder, BuddyInfoOuterClass.BuddyInfoOrBuilder>
            getBuddyInfoFieldBuilder() {
                if (buddyInfoBuilder_ == null) {
                    buddyInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            BuddyInfoOuterClass.BuddyInfo, BuddyInfoOuterClass.BuddyInfo.Builder, BuddyInfoOuterClass.BuddyInfoOrBuilder>(
                            buddyInfo_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    buddyInfo_ = null;
                }
                return buddyInfoBuilder_;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:AddressBook)
        }

    }

    // @@protoc_insertion_point(outer_class_scope)
}