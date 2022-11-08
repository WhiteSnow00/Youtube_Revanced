import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apng extends agzd implements agze
{
    public static final apng a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)apng.class, (agzi)(a = new apng()));
    }
    
    private apng() {
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
                final ahbe e;
                if ((e = apng.e) == null) {
                    synchronized (apng.class) {
                        if (apng.e == null) {
                            apng.e = (ahbe)new agzb((agzi)apng.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apng.a;
            }
            case 4: {
                return new agzc(apng.a);
            }
            case 3: {
                return new apng();
            }
            case 2: {
                return newMessageInfo((MessageLite)apng.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
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
