import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhr extends agzi implements ahax
{
    public static final aqhr a;
    public static final agzg b;
    private static volatile ahbe d;
    public String c;
    private int e;
    private byte f;
    
    static {
        final aqhr a2 = new aqhr();
        agzi.registerDefaultInstance((Class)aqhr.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, (Object)a2, (MessageLite)a2, (agzn)null, 361707526, ahcm.k, (Class)aqhr.class);
    }
    
    private aqhr() {
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
                if ((d = aqhr.d) == null) {
                    synchronized (aqhr.class) {
                        if (aqhr.d == null) {
                            aqhr.d = (ahbe)new agzb((agzi)aqhr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqhr.a;
            }
            case 4: {
                return new agza((agzi)aqhr.a);
            }
            case 3: {
                return new aqhr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhr.a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\t\u1008\u0007", new Object[] { "e", "c" });
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
