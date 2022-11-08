import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgz extends agzi implements ahax
{
    public static final aqgz a;
    public static final agzg b;
    private static volatile ahbe d;
    public aqha c;
    private int e;
    private byte f;
    
    static {
        final aqgz a2 = new aqgz();
        agzi.registerDefaultInstance((Class)aqgz.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, (Object)a2, (MessageLite)a2, (agzn)null, 368882815, ahcm.k, (Class)aqgz.class);
    }
    
    private aqgz() {
        this.f = 2;
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
                if ((d = aqgz.d) == null) {
                    synchronized (aqgz.class) {
                        if (aqgz.d == null) {
                            aqgz.d = (ahbe)new agzb((agzi)aqgz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqgz.a;
            }
            case 4: {
                return new agza((agzi)aqgz.a);
            }
            case 3: {
                return new aqgz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
