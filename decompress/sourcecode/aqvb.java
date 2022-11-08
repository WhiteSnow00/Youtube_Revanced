import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvb extends agzi implements ahax
{
    public static final aqvb a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aqvb.class, a = new aqvb());
    }
    
    private aqvb() {
        this.f = 2;
        this.c = "";
        this.d = "";
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
                final ahbe e;
                if ((e = aqvb.e) == null) {
                    synchronized (aqvb.class) {
                        if (aqvb.e == null) {
                            aqvb.e = (ahbe)new agzb((agzi)aqvb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqvb.a;
            }
            case 4: {
                return new agza((agzi)aqvb.a);
            }
            case 3: {
                return new aqvb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1508\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
