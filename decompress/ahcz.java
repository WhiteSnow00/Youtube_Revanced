import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.util.Collections;
import com.google.protobuf.MessageLite;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import j$.util.concurrent.ConcurrentHashMap;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ahcz extends ahbc
{
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map defaultInstanceMap;
    private int memoizedSerializedSize;
    public ahfs unknownFields;
    
    static /* bridge */ ahcx -$$Nest$smcheckIsLite(final ahci ahci) {
        return checkIsLite(ahci);
    }
    
    static /* bridge */ ahcz -$$Nest$smparsePartialFrom(final ahcz ahcz, final byte[] array, final int n, final int n2, final ExtensionRegistryLite extensionRegistryLite) {
        return parsePartialFrom(ahcz, array, n, n2, extensionRegistryLite);
    }
    
    static {
        ahcz.defaultInstanceMap = (Map)new ConcurrentHashMap();
    }
    
    public ahcz() {
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahfs.a;
    }
    
    private static ahcx checkIsLite(final ahci ahci) {
        return (ahcx)ahci;
    }
    
    private static ahcz checkMessageInitialized(final ahcz ahcz) {
        if (ahcz != null && !ahcz.isInitialized()) {
            throw ahcz.newUninitializedMessageException().a();
        }
        return ahcz;
    }
    
    private int computeSerializedSize(final ahfg ahfg) {
        if (ahfg == null) {
            return ahey.a.b((Object)this).a((Object)this);
        }
        return ahfg.a((Object)this);
    }
    
    protected static ahdb emptyBooleanList() {
        return (ahdb)ahbk.b;
    }
    
    protected static ahdc emptyDoubleList() {
        return (ahdc)ahce.b;
    }
    
    public static ahdg emptyFloatList() {
        return (ahdg)ahcp.b;
    }
    
    public static ahdh emptyIntList() {
        return (ahdh)ahda.b;
    }
    
    public static ahdk emptyLongList() {
        return (ahdk)ahee.b;
    }
    
    public static ahdp emptyProtobufList() {
        return (ahdp)ahez.b;
    }
    
    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == ahfs.a) {
            this.unknownFields = ahfs.c();
        }
    }
    
    protected static ahcl fieldInfo(final Field field, final int n, final ahco ahco) {
        return fieldInfo(field, n, ahco, false);
    }
    
    protected static ahcl fieldInfo(final Field field, final int n, final ahco ahco, final boolean b) {
        if (field == null) {
            return null;
        }
        ahcl.b(n);
        ahdq.i((Object)field, "field");
        ahdq.i((Object)ahco, "fieldType");
        if (ahco != ahco.B && ahco != ahco.X) {
            return new ahcl(field, n, ahco, (Class)null, (Field)null, 0, false, b, (aheu)null, (Class)null, (Object)null, (ahdf)null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }
    
    protected static ahcl fieldInfoForMap(final Field field, final int n, final Object o, final ahdf ahdf) {
        if (field == null) {
            return null;
        }
        ahdq.i(o, "mapDefaultEntry");
        ahcl.b(n);
        ahdq.i((Object)field, "field");
        return new ahcl(field, n, ahco.Y, (Class)null, (Field)null, 0, false, true, (aheu)null, (Class)null, o, ahdf);
    }
    
    protected static ahcl fieldInfoForOneofEnum(final int n, final Object o, final Class clazz, final ahdf ahdf) {
        if (o == null) {
            return null;
        }
        return ahcl.a(n, ahco.m, (aheu)o, clazz, false, ahdf);
    }
    
    protected static ahcl fieldInfoForOneofMessage(final int n, final ahco ahco, final Object o, final Class clazz) {
        if (o == null) {
            return null;
        }
        return ahcl.a(n, ahco, (aheu)o, clazz, false, (ahdf)null);
    }
    
    protected static ahcl fieldInfoForOneofPrimitive(final int n, final ahco ahco, final Object o, final Class clazz) {
        if (o == null) {
            return null;
        }
        return ahcl.a(n, ahco, (aheu)o, clazz, false, (ahdf)null);
    }
    
    protected static ahcl fieldInfoForOneofString(final int n, final Object o, final boolean b) {
        if (o == null) {
            return null;
        }
        return ahcl.a(n, ahco.i, (aheu)o, (Class)String.class, b, (ahdf)null);
    }
    
    public static ahcl fieldInfoForProto2Optional(final Field field, final int n, final ahco ahco, final Field field2, final int n2, final boolean b, final ahdf ahdf) {
        if (field == null || field2 == null) {
            return null;
        }
        ahcl.b(n);
        ahdq.i((Object)field, "field");
        ahdq.i((Object)ahco, "fieldType");
        ahdq.i((Object)field2, "presenceField");
        if (ahcl.c(n2)) {
            return new ahcl(field, n, ahco, (Class)null, field2, n2, false, b, (aheu)null, (Class)null, (Object)null, ahdf);
        }
        final StringBuilder sb = new StringBuilder("presenceMask must have exactly one bit set: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    protected static ahcl fieldInfoForProto2Optional(final Field field, final long n, final ahco ahco, final Field field2) {
        return fieldInfoForProto2Optional(field, (int)(n >>> 32), ahco, field2, (int)n, false, null);
    }
    
    public static ahcl fieldInfoForProto2Required(final Field field, final int n, final ahco ahco, final Field field2, final int n2, final boolean b, final ahdf ahdf) {
        if (field == null || field2 == null) {
            return null;
        }
        ahcl.b(n);
        ahdq.i((Object)field, "field");
        ahdq.i((Object)ahco, "fieldType");
        ahdq.i((Object)field2, "presenceField");
        if (ahcl.c(n2)) {
            return new ahcl(field, n, ahco, (Class)null, field2, n2, true, b, (aheu)null, (Class)null, (Object)null, ahdf);
        }
        final StringBuilder sb = new StringBuilder("presenceMask must have exactly one bit set: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    protected static ahcl fieldInfoForProto2Required(final Field field, final long n, final ahco ahco, final Field field2) {
        return fieldInfoForProto2Required(field, (int)(n >>> 32), ahco, field2, (int)n, false, null);
    }
    
    protected static ahcl fieldInfoForRepeatedMessage(final Field field, final int n, final ahco ahco, final Class clazz) {
        if (field == null) {
            return null;
        }
        ahcl.b(n);
        ahdq.i((Object)field, "field");
        ahdq.i((Object)ahco, "fieldType");
        ahdq.i((Object)clazz, "messageClass");
        return new ahcl(field, n, ahco, clazz, (Field)null, 0, false, false, (aheu)null, (Class)null, (Object)null, (ahdf)null);
    }
    
    protected static ahcl fieldInfoWithEnumVerifier(final Field field, final int n, final ahco ahco, final ahdf ahdf) {
        if (field == null) {
            return null;
        }
        ahcl.b(n);
        ahdq.i((Object)field, "field");
        return new ahcl(field, n, ahco, (Class)null, (Field)null, 0, false, false, (aheu)null, (Class)null, (Object)null, ahdf);
    }
    
    static ahcz getDefaultInstance(final Class clazz) {
        ahcz ahcz;
        if ((ahcz = ahcz.defaultInstanceMap.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                ahcz = ahcz.defaultInstanceMap.get(clazz);
            }
            catch (final ClassNotFoundException ex) {
                throw new IllegalStateException("Class initialization cannot fail.", ex);
            }
        }
        ahcz defaultInstanceForType;
        if ((defaultInstanceForType = ahcz) == null) {
            defaultInstanceForType = ((ahcz)ahfz.h(clazz)).getDefaultInstanceForType();
            if (defaultInstanceForType == null) {
                throw new IllegalStateException();
            }
            ahcz.defaultInstanceMap.put(clazz, defaultInstanceForType);
        }
        return defaultInstanceForType;
    }
    
    static Method getMethodOrDie(final Class clazz, final String s, final Class... array) {
        try {
            return clazz.getMethod(s, (Class[])array);
        }
        catch (final NoSuchMethodException ex) {
            final String name = clazz.getName();
            final StringBuilder sb = new StringBuilder("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(s);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), ex);
        }
    }
    
    static Object invokeOrDie(final Method method, final Object o, final Object... array) {
        try {
            return method.invoke(o, array);
        }
        catch (final InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", ex2);
        }
    }
    
    protected static final boolean isInitialized(final ahcz ahcz, final boolean b) {
        final byte byteValue = (byte)ahcz.dynamicMethod(ahcy.a);
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        final boolean k = ahey.a.b((Object)ahcz).k((Object)ahcz);
        if (b) {
            Object o;
            if (!k) {
                o = null;
            }
            else {
                o = ahcz;
            }
            ahcz.dynamicMethod(ahcy.b, o);
        }
        return k;
    }
    
    protected static ahdb mutableCopy(final ahdb ahdb) {
        final int size = ahdb.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return ahdb.d(n);
    }
    
    protected static ahdc mutableCopy(final ahdc ahdc) {
        final int size = ahdc.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return ahdc.d(n);
    }
    
    public static ahdg mutableCopy(final ahdg ahdg) {
        final int size = ahdg.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return ahdg.g(n);
    }
    
    public static ahdh mutableCopy(final ahdh ahdh) {
        final int size = ahdh.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return ahdh.f(n);
    }
    
    public static ahdk mutableCopy(final ahdk ahdk) {
        final int size = ahdk.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return ahdk.d(n);
    }
    
    public static ahdp mutableCopy(final ahdp ahdp) {
        final int size = ahdp.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return ahdp.e(n);
    }
    
    protected static Object[] newFieldInfoArray(final int n) {
        return new ahcl[n];
    }
    
    protected static ahel newMessageInfo(final ahex ahex, final int[] array, final Object[] array2, final Object o) {
        return (ahel)new ahfp(ahex, false, array, (ahcl[])array2, o);
    }
    
    protected static Object newMessageInfo(final MessageLite messageLite, final String s, final Object[] array) {
        return new ahfa(messageLite, s, array);
    }
    
    protected static ahel newMessageInfoForMessageSet(final ahex ahex, final int[] array, final Object[] array2, final Object o) {
        return (ahel)new ahfp(ahex, true, array, (ahcl[])array2, o);
    }
    
    protected static aheu newOneofInfo(final int n, final Field field, final Field field2) {
        if (field != null && field2 != null) {
            return new aheu(field, field2);
        }
        return null;
    }
    
    public static ahcx newRepeatedGeneratedExtension(final MessageLite messageLite, final MessageLite messageLite2, final ahde ahde, final int n, final ahgc ahgc, final boolean b, final Class clazz) {
        return new ahcx(messageLite, Collections.emptyList(), messageLite2, new ahcw(ahde, n, ahgc, true, b));
    }
    
    public static ahcx newSingularGeneratedExtension(final MessageLite messageLite, final Object o, final MessageLite messageLite2, final ahde ahde, final int n, final ahgc ahgc, final Class clazz) {
        return new ahcx(messageLite, o, messageLite2, new ahcw(ahde, n, ahgc, false, false));
    }
    
    public static ahcz parseDelimitedFrom(ahcz partialDelimited, final InputStream inputStream) {
        partialDelimited = parsePartialDelimitedFrom(partialDelimited, inputStream, ExtensionRegistryLite.a);
        checkMessageInitialized(partialDelimited);
        return partialDelimited;
    }
    
    public static ahcz parseDelimitedFrom(ahcz partialDelimited, final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        partialDelimited = parsePartialDelimitedFrom(partialDelimited, inputStream, extensionRegistryLite);
        checkMessageInitialized(partialDelimited);
        return partialDelimited;
    }
    
    public static ahcz parseFrom(ahcz from, final ahbt ahbt) {
        from = parseFrom(from, ahbt, ExtensionRegistryLite.a);
        checkMessageInitialized(from);
        return from;
    }
    
    public static ahcz parseFrom(ahcz partial, final ahbt ahbt, final ExtensionRegistryLite extensionRegistryLite) {
        partial = parsePartialFrom(partial, ahbt, extensionRegistryLite);
        checkMessageInitialized(partial);
        return partial;
    }
    
    protected static ahcz parseFrom(final ahcz ahcz, final ahby ahby) {
        return parseFrom(ahcz, ahby, ExtensionRegistryLite.a);
    }
    
    protected static ahcz parseFrom(ahcz partial, final ahby ahby, final ExtensionRegistryLite extensionRegistryLite) {
        partial = parsePartialFrom(partial, ahby, extensionRegistryLite);
        checkMessageInitialized(partial);
        return partial;
    }
    
    protected static ahcz parseFrom(ahcz partial, final InputStream inputStream) {
        partial = parsePartialFrom(partial, ahby.M(inputStream), ExtensionRegistryLite.a);
        checkMessageInitialized(partial);
        return partial;
    }
    
    public static ahcz parseFrom(ahcz partial, final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        partial = parsePartialFrom(partial, ahby.M(inputStream), extensionRegistryLite);
        checkMessageInitialized(partial);
        return partial;
    }
    
    protected static ahcz parseFrom(final ahcz ahcz, final ByteBuffer byteBuffer) {
        return parseFrom(ahcz, byteBuffer, ExtensionRegistryLite.a);
    }
    
    public static ahcz parseFrom(ahcz from, final ByteBuffer byteBuffer, final ExtensionRegistryLite extensionRegistryLite) {
        from = parseFrom(from, ahby.N(byteBuffer), extensionRegistryLite);
        checkMessageInitialized(from);
        return from;
    }
    
    public static ahcz parseFrom(ahcz partial, final byte[] array) {
        partial = parsePartialFrom(partial, array, 0, array.length, ExtensionRegistryLite.a);
        checkMessageInitialized(partial);
        return partial;
    }
    
    public static ahcz parseFrom(ahcz partial, final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        partial = parsePartialFrom(partial, array, 0, array.length, extensionRegistryLite);
        checkMessageInitialized(partial);
        return partial;
    }
    
    private static ahcz parsePartialDelimitedFrom(ahcz partial, final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        try {
            final int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            final ahby m = ahby.M((InputStream)new ahba(inputStream, ahby.K(read, inputStream)));
            partial = parsePartialFrom(partial, m, extensionRegistryLite);
            try {
                m.B(0);
                return partial;
            }
            catch (final ahds ahds) {
                throw ahds;
            }
        }
        catch (final IOException ex) {
            throw new ahds(ex);
        }
        catch (final ahds ahds2) {
            if (ahds2.a) {
                throw new ahds((IOException)ahds2);
            }
            throw ahds2;
        }
    }
    
    private static ahcz parsePartialFrom(ahcz partial, final ahbt ahbt, final ExtensionRegistryLite extensionRegistryLite) {
        final ahby l = ahbt.l();
        partial = parsePartialFrom(partial, l, extensionRegistryLite);
        try {
            l.B(0);
            return partial;
        }
        catch (final ahds ahds) {
            throw ahds;
        }
    }
    
    protected static ahcz parsePartialFrom(final ahcz ahcz, final ahby ahby) {
        return parsePartialFrom(ahcz, ahby, ExtensionRegistryLite.a);
    }
    
    public static ahcz parsePartialFrom(final ahcz ahcz, final ahby ahby, final ExtensionRegistryLite extensionRegistryLite) {
        final ahcz mutableInstance = ahcz.newMutableInstance();
        try {
            final ahfg b = ahey.a.b((Object)mutableInstance);
            b.h((Object)mutableInstance, (ahfb)ahbz.p(ahby), extensionRegistryLite);
            b.f((Object)mutableInstance);
            return mutableInstance;
        }
        catch (final RuntimeException ex) {
            if (ex.getCause() instanceof ahds) {
                throw (ahds)ex.getCause();
            }
            throw ex;
        }
        catch (final IOException ex2) {
            if (ex2.getCause() instanceof ahds) {
                throw (ahds)ex2.getCause();
            }
            throw new ahds(ex2);
        }
        catch (final ahfr ahfr) {
            throw ahfr.a();
        }
        catch (final ahds ahds) {
            if (ahds.a) {
                throw new ahds((IOException)ahds);
            }
            throw ahds;
        }
    }
    
    private static ahcz parsePartialFrom(final ahcz ahcz, final byte[] array, final int n, final int n2, final ExtensionRegistryLite extensionRegistryLite) {
        final ahcz mutableInstance = ahcz.newMutableInstance();
        try {
            final ahfg b = ahey.a.b((Object)mutableInstance);
            b.i((Object)mutableInstance, array, n, n + n2, new ahbh(extensionRegistryLite));
            b.f((Object)mutableInstance);
            return mutableInstance;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw ahds.j();
        }
        catch (final IOException ex2) {
            if (ex2.getCause() instanceof ahds) {
                throw (ahds)ex2.getCause();
            }
            throw new ahds(ex2);
        }
        catch (final ahfr ahfr) {
            throw ahfr.a();
        }
        catch (final ahds ahds) {
            if (ahds.a) {
                throw new ahds((IOException)ahds);
            }
            throw ahds;
        }
    }
    
    protected static Field reflectField(final Class clazz, final String s) {
        try {
            return clazz.getDeclaredField(s);
        }
        catch (final NoSuchFieldException ex) {
            return null;
        }
    }
    
    protected static void registerDefaultInstance(final Class clazz, final ahcz ahcz) {
        ahcz.markImmutable();
        ahcz.defaultInstanceMap.put(clazz, ahcz);
    }
    
    public Object buildMessageInfo() {
        return this.dynamicMethod(ahcy.c);
    }
    
    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }
    
    public void clearMemoizedSerializedSize() {
        this.setMemoizedSerializedSize(Integer.MAX_VALUE);
    }
    
    public int computeHashCode() {
        return ahey.a.b((Object)this).b((Object)this);
    }
    
    public final ahcr createBuilder() {
        return (ahcr)this.dynamicMethod(ahcy.e);
    }
    
    public final ahcr createBuilder(final ahcz ahcz) {
        return this.createBuilder().mergeFrom(ahcz);
    }
    
    protected Object dynamicMethod(final ahcy ahcy) {
        return this.dynamicMethod(ahcy, null, null);
    }
    
    protected Object dynamicMethod(final ahcy ahcy, final Object o) {
        return this.dynamicMethod(ahcy, o, null);
    }
    
    protected abstract Object dynamicMethod(final ahcy p0, final Object p1, final Object p2);
    
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && ahey.a.b((Object)this).j((Object)this, (Object)o));
    }
    
    public final ahcz getDefaultInstanceForType() {
        return (ahcz)this.dynamicMethod(ahcy.f);
    }
    
    public /* bridge */ MessageLite getDefaultInstanceForType() {
        return (MessageLite)this.getDefaultInstanceForType();
    }
    
    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }
    
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }
    
    public final ahev getParserForType() {
        return (ahev)this.dynamicMethod(ahcy.g);
    }
    
    public int getSerializedSize() {
        return this.getSerializedSize((ahfg)null);
    }
    
    public int getSerializedSize(final ahfg ahfg) {
        if (this.isMutable()) {
            final int computeSerializedSize = this.computeSerializedSize(ahfg);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            final StringBuilder sb = new StringBuilder("serialized size must be non-negative, was ");
            sb.append(computeSerializedSize);
            throw new IllegalStateException(sb.toString());
        }
        else {
            if (this.getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return this.getMemoizedSerializedSize();
            }
            final int computeSerializedSize2 = this.computeSerializedSize(ahfg);
            this.setMemoizedSerializedSize(computeSerializedSize2);
            return computeSerializedSize2;
        }
    }
    
    public int hashCode() {
        if (this.isMutable()) {
            return this.computeHashCode();
        }
        if (this.hashCodeIsNotMemoized()) {
            this.setMemoizedHashCode(this.computeHashCode());
        }
        return this.getMemoizedHashCode();
    }
    
    public boolean hashCodeIsNotMemoized() {
        return this.getMemoizedHashCode() == 0;
    }
    
    public final boolean isInitialized() {
        return isInitialized(this, Boolean.TRUE);
    }
    
    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0x0;
    }
    
    protected void makeImmutable() {
        ahey.a.b((Object)this).f((Object)this);
        this.markImmutable();
    }
    
    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }
    
    protected void mergeLengthDelimitedField(final int n, final ahbt ahbt) {
        this.ensureUnknownFieldsInitialized();
        final ahfs unknownFields = this.unknownFields;
        unknownFields.d();
        if (n != 0) {
            unknownFields.g(ahge.c(n, 2), (Object)ahbt);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }
    
    protected final void mergeUnknownFields(final ahfs ahfs) {
        this.unknownFields = ahfs.b(this.unknownFields, ahfs);
    }
    
    protected void mergeVarintField(final int n, final int n2) {
        this.ensureUnknownFieldsInitialized();
        final ahfs unknownFields = this.unknownFields;
        unknownFields.d();
        if (n != 0) {
            unknownFields.g(ahge.c(n, 0), (Object)(long)n2);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }
    
    public ahes mutableCopy() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }
    
    public final ahcr newBuilderForType() {
        return (ahcr)this.dynamicMethod(ahcy.e);
    }
    
    public /* bridge */ ahen newBuilderForType() {
        return (ahen)this.newBuilderForType();
    }
    
    public ahcz newMutableInstance() {
        return (ahcz)this.dynamicMethod(ahcy.d);
    }
    
    protected boolean parseUnknownField(final int n, final ahby ahby) {
        if (ahge.b(n) == 4) {
            return false;
        }
        this.ensureUnknownFieldsInitialized();
        return this.unknownFields.h(n, ahby);
    }
    
    public void setMemoizedHashCode(final int memoizedHashCode) {
        this.memoizedHashCode = memoizedHashCode;
    }
    
    public void setMemoizedSerializedSize(final int n) {
        if (n >= 0) {
            this.memoizedSerializedSize = (n | (this.memoizedSerializedSize & Integer.MIN_VALUE));
            return;
        }
        final StringBuilder sb = new StringBuilder("serialized size must be non-negative, was ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public final ahcr toBuilder() {
        return ((ahcr)this.dynamicMethod(ahcy.e)).mergeFrom(this);
    }
    
    public /* bridge */ ahen toBuilder() {
        return (ahen)this.toBuilder();
    }
    
    public String toString() {
        return ahep.a((MessageLite)this, super.toString());
    }
    
    public void writeTo(final ahcd ahcd) {
        final ahfg b = ahey.a.b((Object)this);
        final agpd f = ahcd.f;
        agpd agpd;
        if (f != null) {
            agpd = f;
        }
        else {
            agpd = new agpd(ahcd);
        }
        b.l((Object)this, agpd);
    }
}
