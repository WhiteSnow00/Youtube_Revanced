import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpf extends agzi implements ahax
{
    public static final akpf a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpf.class, a = new akpf());
    }
    
    private akpf() {
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
                if ((d = akpf.d) == null) {
                    synchronized (akpf.class) {
                        if (akpf.d == null) {
                            akpf.d = (ahbe)new agzb((agzi)akpf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akpf.a;
            }
            case 4: {
                return new agza((agzi)akpf.a);
            }
            case 3: {
                return new akpf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpf.a, "\u0001\u0007\u0001\u0000\uf264\u165b\ue84d\u3ac7\u0007\u0000\u0000\u0007\uf264\u165b\u143c\u0000\uf90a\u1686\u143c\u0000\uf8c1\u16cd\u143c\u0000\uf67a\u191a\u143c\u0000\uffc9\u19bf\u143c\u0000\ue0a5\u3834\u143c\u0000\ue84d\u3ac7\u143c\u0000", new Object[] { "c", "b", ajxx.class, ajxz.class, ajxv.class, ajxy.class, ajxw.class, amzn.class, amig.class });
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
