import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apej extends agzi implements ahax
{
    public static final apej a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public alvx d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apej.class, a = new apej());
    }
    
    private apej() {
        this.f = 2;
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
                final ahbe e;
                if ((e = apej.e) == null) {
                    synchronized (apej.class) {
                        if (apej.e == null) {
                            apej.e = (ahbe)new agzb((agzi)apej.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apej.a;
            }
            case 4: {
                return new agza((agzi)apej.a);
            }
            case 3: {
                return new apej();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apej.a, "\u0001\u0002\u0000\u0001\u0005\ufca3\u420e\u0002\u0000\u0000\u0001\u0005\u1008\u0004\ufca3\u420e\u1409\u0006", new Object[] { "b", "c", "d" });
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
