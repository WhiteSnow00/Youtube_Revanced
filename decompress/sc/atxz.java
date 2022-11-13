import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxz extends ahbh implements ahcw
{
    public static final atxz a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)atxz.class, (ahbh)(a = new atxz()));
    }
    
    private atxz() {
        this.d = 2;
        this.b = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx b = this.b;
        if (!b.c()) {
            this.b = ahbh.mutableCopy(b);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = atxz.c) == null) {
                    synchronized (atxz.class) {
                        if (atxz.c == null) {
                            atxz.c = (ahdd)new ahba((ahbh)atxz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return atxz.a;
            }
            case 4: {
                return new ahaz((float[][][])null, (byte[][][])null);
            }
            case 3: {
                return new atxz();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", atxy.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
