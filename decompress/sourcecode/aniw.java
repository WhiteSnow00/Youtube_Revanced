import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniw extends agzi implements ahax
{
    public static final aniw a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aniw.class, a = new aniw());
    }
    
    private aniw() {
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
                if ((d = aniw.d) == null) {
                    synchronized (aniw.class) {
                        if (aniw.d == null) {
                            aniw.d = (ahbe)new agzb((agzi)aniw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aniw.a;
            }
            case 4: {
                return new agza((agzi)aniw.a);
            }
            case 3: {
                return new aniw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aniw.a, "\u0001\u0001\u0001\u0000\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u143c\u0000", new Object[] { "c", "b", aiva.class });
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
