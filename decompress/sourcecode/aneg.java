import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aneg extends agzi implements ahax
{
    public static final aneg a;
    private static volatile ahbe d;
    public int b;
    public ameo c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aneg.class, a = new aneg());
    }
    
    private aneg() {
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
                if ((d = aneg.d) == null) {
                    synchronized (aneg.class) {
                        if (aneg.d == null) {
                            aneg.d = (ahbe)new agzb((agzi)aneg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aneg.a;
            }
            case 4: {
                return new agza((agzi)aneg.a);
            }
            case 3: {
                return new aneg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aneg.a, "\u0001\u0001\u0000\u0001\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u1409\u0000", new Object[] { "b", "c" });
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
