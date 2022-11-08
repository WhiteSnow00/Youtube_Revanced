import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpz extends agzi implements ahax
{
    public static final akpz a;
    private static volatile ahbe b;
    private int c;
    private akqa d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpz.class, a = new akpz());
    }
    
    private akpz() {
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
                final ahbe b2;
                if ((b2 = akpz.b) == null) {
                    synchronized (akpz.class) {
                        if (akpz.b == null) {
                            akpz.b = (ahbe)new agzb((agzi)akpz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return akpz.a;
            }
            case 4: {
                return new agza((agzi)akpz.a);
            }
            case 3: {
                return new akpz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpz.a, "\u0001\u0001\u0000\u0001\uf31e\u3e9c\uf31e\u3e9c\u0001\u0000\u0000\u0001\uf31e\u3e9c\u1409\u0000", new Object[] { "c", "d" });
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
