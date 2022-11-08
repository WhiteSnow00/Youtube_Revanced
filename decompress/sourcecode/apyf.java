import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyf extends agzi implements ahax
{
    public static final apyf a;
    private static volatile ahbe f;
    public long b;
    public long c;
    public String d;
    public apyg e;
    private int g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apyf.class, a = new apyf());
    }
    
    private apyf() {
        this.h = 2;
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
                final ahbe f;
                if ((f = apyf.f) == null) {
                    synchronized (apyf.class) {
                        if (apyf.f == null) {
                            apyf.f = (ahbe)new agzb((agzi)apyf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apyf.a;
            }
            case 4: {
                return new agza((agzi)apyf.a);
            }
            case 3: {
                return new apyf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyf.a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1409\u0005\u0006\u1008\u0004", new Object[] { "g", "b", "c", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
