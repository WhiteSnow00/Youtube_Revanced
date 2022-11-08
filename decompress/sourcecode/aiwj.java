import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwj extends agzi implements ahax
{
    public static final aiwj a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aiwj.class, a = new aiwj());
    }
    
    private aiwj() {
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
                if ((d = aiwj.d) == null) {
                    synchronized (aiwj.class) {
                        if (aiwj.d == null) {
                            aiwj.d = (ahbe)new agzb((agzi)aiwj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiwj.a;
            }
            case 4: {
                return new agza((agzi)aiwj.a);
            }
            case 3: {
                return new aiwj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwj.a, "\u0001\u0002\u0001\u0000\uec84\u23b5\ue55b\u37ee\u0002\u0000\u0000\u0002\uec84\u23b5\u143c\u0000\ue55b\u37ee\u143c\u0000", new Object[] { "c", "b", aiwi.class, alpx.class });
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
