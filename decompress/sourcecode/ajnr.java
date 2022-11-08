import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnr extends agzi implements ahax
{
    public static final ajnr a;
    public static final agzg b;
    private static volatile ahbe e;
    public aost c;
    public agzy d;
    private int f;
    private byte g;
    
    static {
        final ajnr a2 = new ajnr();
        agzi.registerDefaultInstance((Class)ajnr.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajtl.a, (Object)a2, (MessageLite)a2, (agzn)null, 1, ahcm.k, (Class)ajnr.class);
    }
    
    private ajnr() {
        this.g = 2;
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajnr.e) == null) {
                    synchronized (ajnr.class) {
                        if (ajnr.e == null) {
                            ajnr.e = (ahbe)new agzb((agzi)ajnr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajnr.a;
            }
            case 4: {
                return new agza((agzi)ajnr.a);
            }
            case 3: {
                return new ajnr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u041b\u0002\u1009\u0000", new Object[] { "f", "d", ajny.class, "c" });
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
