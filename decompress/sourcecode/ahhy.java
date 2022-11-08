import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhy extends agzi implements ahax
{
    public static final ahhy a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahhy.class, a = new ahhy());
    }
    
    private ahhy() {
        this.b = 0;
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
                if ((d = ahhy.d) == null) {
                    synchronized (ahhy.class) {
                        if (ahhy.d == null) {
                            ahhy.d = (ahbe)new agzb((agzi)ahhy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahhy.a;
            }
            case 4: {
                return new agza((agzi)ahhy.a);
            }
            case 3: {
                return new ahhy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhy.a, "\u0001\u0002\u0001\u0000\ueeec\u1e3f\ued6a\u25bb\u0002\u0000\u0000\u0002\ueeec\u1e3f\u143c\u0000\ued6a\u25bb\u143c\u0000", new Object[] { "c", "b", ahhw.class, aisy.class });
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
