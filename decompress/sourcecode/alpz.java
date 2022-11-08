import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpz extends agzi implements ahax
{
    public static final alpz a;
    private static volatile ahbe h;
    public int b;
    public ansi c;
    public aorx d;
    public alhg e;
    public alqa f;
    public aney g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(alpz.class, a = new alpz());
    }
    
    private alpz() {
        this.i = 2;
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
                final ahbe h;
                if ((h = alpz.h) == null) {
                    synchronized (alpz.class) {
                        if (alpz.h == null) {
                            alpz.h = (ahbe)new agzb((agzi)alpz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alpz.a;
            }
            case 4: {
                return new agza((agzi)alpz.a);
            }
            case 3: {
                return new alpz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpz.a, "\u0001\u0005\u0000\u0001\uf697\u1cd7\uf07f\u46ae\u0005\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000\uec98\u218a\u1009\u0001\uf488\u2524\u1009\u0002\ue75e\u4534\u1009\u0003\uf07f\u46ae\u1009\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
