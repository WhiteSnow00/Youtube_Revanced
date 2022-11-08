import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aega extends agzi implements ahax
{
    public static final aega a;
    private static volatile ahbe f;
    public agzy b;
    public agzy c;
    public agzy d;
    public agzy e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aega.class, a = new aega());
    }
    
    private aega() {
        this.g = 2;
        this.b = agzi.emptyProtobufList();
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aega.f) == null) {
                    synchronized (aega.class) {
                        if (aega.f == null) {
                            aega.f = (ahbe)new agzb((agzi)aega.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aega.a;
            }
            case 4: {
                return new agza((agzi)aega.a);
            }
            case 3: {
                return new aega();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aega.a, "\u0001\u0004\u0000\u0000\u00032\u0004\u0000\u0004\u0000\u0003\u001b\u0004\u001b0\u001b2\u001b", new Object[] { "c", aefz.class, "d", aegd.class, "b", aege.class, "e", aefy.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
