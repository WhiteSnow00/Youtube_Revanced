import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdx extends agzi implements ahax
{
    public static final apdx a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apdx.class, a = new apdx());
    }
    
    private apdx() {
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
                if ((d = apdx.d) == null) {
                    synchronized (apdx.class) {
                        if (apdx.d == null) {
                            apdx.d = (ahbe)new agzb((agzi)apdx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdx.a;
            }
            case 4: {
                return new agza((agzi)apdx.a);
            }
            case 3: {
                return new apdx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdx.a, "\u0001\u0002\u0001\u0000\uec06\u17ef\uf74f\u2a6b\u0002\u0000\u0000\u0002\uec06\u17ef\u143c\u0000\uf74f\u2a6b\u143c\u0000", new Object[] { "c", "b", alib.class, akac.class });
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
