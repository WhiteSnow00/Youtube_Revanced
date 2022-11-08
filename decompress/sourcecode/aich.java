import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aich extends agzi implements ahax
{
    public static final aich a;
    public static final agzg b;
    private static volatile ahbe d;
    public String c;
    private int e;
    private byte f;
    
    static {
        final aich a2 = new aich();
        agzi.registerDefaultInstance((Class)aich.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 471068491, ahcm.k, (Class)aich.class);
    }
    
    private aich() {
        this.f = 2;
        this.c = "";
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
                final ahbe d;
                if ((d = aich.d) == null) {
                    synchronized (aich.class) {
                        if (aich.d == null) {
                            aich.d = (ahbe)new agzb((agzi)aich.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aich.a;
            }
            case 4: {
                return new agza((agzi)aich.a);
            }
            case 3: {
                return new aich();
            }
            case 2: {
                return newMessageInfo((MessageLite)aich.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
