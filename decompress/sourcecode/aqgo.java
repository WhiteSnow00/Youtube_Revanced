import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgo extends agzi implements ahax
{
    public static final aqgo a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public amwv e;
    public String f;
    private aqhb h;
    private aqfp i;
    private aqhk j;
    private aqfp k;
    private byte l;
    
    static {
        final aqgo a2 = new aqgo();
        agzi.registerDefaultInstance((Class)aqgo.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, (Object)a2, (MessageLite)a2, (agzn)null, 363458402, ahcm.k, (Class)aqgo.class);
    }
    
    private aqgo() {
        this.l = 2;
        this.d = "";
        this.f = "";
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
                final ahbe g;
                if ((g = aqgo.g) == null) {
                    synchronized (aqgo.class) {
                        if (aqgo.g == null) {
                            aqgo.g = (ahbe)new agzb((agzi)aqgo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqgo.a;
            }
            case 4: {
                return new agza((agzi)aqgo.a);
            }
            case 3: {
                return new aqgo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgo.a, "\u0001\u0007\u0000\u0001\u0003\u000b\u0007\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005\u0007\u1409\u0006\b\u1008\u0007\t\u1009\b\u000b\u1008\n", new Object[] { "c", "h", "i", "j", "k", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
