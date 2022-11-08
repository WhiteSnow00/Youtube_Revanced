import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgn extends agzi implements ahax
{
    public static final aqgn a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public aqic d;
    public String e;
    public alhm f;
    public String g;
    private aqgm i;
    private byte j;
    
    static {
        final aqgn a2 = new aqgn();
        agzi.registerDefaultInstance((Class)aqgn.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, (Object)a2, (MessageLite)a2, (agzn)null, 406207899, ahcm.k, (Class)aqgn.class);
    }
    
    private aqgn() {
        this.j = 2;
        this.e = "";
        this.g = "";
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
                final ahbe h;
                if ((h = aqgn.h) == null) {
                    synchronized (aqgn.class) {
                        if (aqgn.h == null) {
                            aqgn.h = (ahbe)new agzb((agzi)aqgn.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqgn.a;
            }
            case 4: {
                return new agza((agzi)aqgn.a);
            }
            case 3: {
                return new aqgn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgn.a, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1008\u0004\b\u1009\u0005\t\u1008\u0006", new Object[] { "c", "i", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
