import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqf extends agzi implements ahax
{
    public static final ajqf a;
    private static volatile ahbe b;
    private int c;
    private ajqd d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajqf.class, (agzi)(a = new ajqf()));
    }
    
    private ajqf() {
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
                final ahbe b2;
                if ((b2 = ajqf.b) == null) {
                    synchronized (ajqf.class) {
                        if (ajqf.b == null) {
                            ajqf.b = (ahbe)new agzb((agzi)ajqf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajqf.a;
            }
            case 4: {
                return new agza((agzi)ajqf.a);
            }
            case 3: {
                return new ajqf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajqf.a, "\u0001\u0001\u0000\u0001\uf828\u188d\uf828\u188d\u0001\u0000\u0000\u0001\uf828\u188d\u1409\u0000", new Object[] { "c", "d" });
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
