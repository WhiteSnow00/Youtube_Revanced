import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apom extends agzi implements ahax
{
    public static final apom a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apom.class, (agzi)(a = new apom()));
    }
    
    private apom() {
        this.b = 0;
        this.e = 2;
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
                if ((d = apom.d) == null) {
                    synchronized (apom.class) {
                        if (apom.d == null) {
                            apom.d = (ahbe)new agzb((agzi)apom.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apom.a;
            }
            case 4: {
                return new agza((agzi)apom.a);
            }
            case 3: {
                return new apom();
            }
            case 2: {
                return newMessageInfo((MessageLite)apom.a, "\u0001\u0001\u0001\u0000\ufd29\u49e2\ufd29\u49e2\u0001\u0000\u0000\u0001\ufd29\u49e2\u143c\u0000", new Object[] { "c", "b", apol.class });
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
