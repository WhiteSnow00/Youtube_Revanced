import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdy extends agzi implements ahax
{
    public static final apdy a;
    private static volatile ahbe d;
    public int b;
    public anss c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apdy.class, a = new apdy());
    }
    
    private apdy() {
        this.e = 2;
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
                final ahbe d;
                if ((d = apdy.d) == null) {
                    synchronized (apdy.class) {
                        if (apdy.d == null) {
                            apdy.d = (ahbe)new agzb((agzi)apdy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdy.a;
            }
            case 4: {
                return new agza((agzi)apdy.a);
            }
            case 3: {
                return new apdy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
