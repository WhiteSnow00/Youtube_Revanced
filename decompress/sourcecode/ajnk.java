import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnk extends agzi implements ahax
{
    public static final ajnk a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajnk.class, (agzi)(a = new ajnk()));
    }
    
    private ajnk() {
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
                if ((d = ajnk.d) == null) {
                    synchronized (ajnk.class) {
                        if (ajnk.d == null) {
                            ajnk.d = (ahbe)new agzb((agzi)ajnk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnk.a;
            }
            case 4: {
                return new agza((agzi)ajnk.a);
            }
            case 3: {
                return new ajnk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnk.a, "\u0001\u0006\u0001\u0000\uf158\u1824\uf0a1\u9046\u0006\u0000\u0000\u0006\uf158\u1824\u143c\u0000\ufccc\u4220\u143c\u0000\uf492\u4933\u143c\u0000\ueb1b\u5817\u143c\u0000\uf346\u5ccb\u143c\u0000\uf0a1\u9046\u143c\u0000", new Object[] { "c", "b", angx.class, ajnn.class, ajkj.class, ahov.class, ahou.class, aosy.class });
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
