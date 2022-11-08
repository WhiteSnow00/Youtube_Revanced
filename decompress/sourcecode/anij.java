import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anij extends agzi implements ahax
{
    public static final anij a;
    private static volatile ahbe e;
    public int b;
    public amoy c;
    public anky d;
    private ansi f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(anij.class, a = new anij());
    }
    
    private anij() {
        this.g = 2;
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
                final ahbe e;
                if ((e = anij.e) == null) {
                    synchronized (anij.class) {
                        if (anij.e == null) {
                            anij.e = (ahbe)new agzb((agzi)anij.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anij.a;
            }
            case 4: {
                return new agza((agzi)anij.a);
            }
            case 3: {
                return new anij();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anij.a, "\u0001\u0003\u0000\u0001\ueee9\u18d1\uf697\u1cd7\u0003\u0000\u0000\u0002\ueee9\u18d1\u1409\u0000\ueeed\u18d1\u1009\u0001\uf697\u1cd7\u1409\u0002", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
