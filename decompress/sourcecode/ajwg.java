import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwg extends agzi implements ahax
{
    public static final ajwg a;
    private static volatile ahbe c;
    public int b;
    private Object d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajwg.class, a = new ajwg());
    }
    
    private ajwg() {
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
                final ahbe c;
                if ((c = ajwg.c) == null) {
                    synchronized (ajwg.class) {
                        if (ajwg.c == null) {
                            ajwg.c = (ahbe)new agzb((agzi)ajwg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajwg.a;
            }
            case 4: {
                return new agza((agzi)ajwg.a);
            }
            case 3: {
                return new ajwg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwg.a, "\u0001\u0003\u0001\u0000\uf143\u1824\ufef6\u394c\u0003\u0000\u0000\u0003\uf143\u1824\u143c\u0000\uf127\u2a72\u143c\u0000\ufef6\u394c\u143c\u0000", new Object[] { "d", "b", aiuh.class, apmz.class, apil.class });
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
