import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmz extends agzi implements ahax
{
    public static final akmz a;
    private static volatile ahbe c;
    public amyo b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akmz.class, a = new akmz());
    }
    
    private akmz() {
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
                if ((c = akmz.c) == null) {
                    synchronized (akmz.class) {
                        if (akmz.c == null) {
                            akmz.c = (ahbe)new agzb((agzi)akmz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akmz.a;
            }
            case 4: {
                return new agza((agzi)akmz.a);
            }
            case 3: {
                return new akmz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmz.a, "\u0001\u0001\u0000\u0001\ue287\u3f82\ue287\u3f82\u0001\u0000\u0000\u0001\ue287\u3f82\u1409\u0000", new Object[] { "d", "b" });
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