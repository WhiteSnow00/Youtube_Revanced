import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhb extends agzi implements ahax
{
    public static final ahhb a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public boolean d;
    public ahhc e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahhb.class, a = new ahhb());
    }
    
    private ahhb() {
        this.g = 2;
        this.c = "";
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
                if ((f = ahhb.f) == null) {
                    synchronized (ahhb.class) {
                        if (ahhb.f == null) {
                            ahhb.f = (ahbe)new agzb((agzi)ahhb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahhb.a;
            }
            case 4: {
                return new agza((agzi)ahhb.a);
            }
            case 3: {
                return new ahhb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0003", new Object[] { "b", "c", "d", "e" });
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
