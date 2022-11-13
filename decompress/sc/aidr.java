import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidr extends ahbh implements ahcw
{
    public static final aidr a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aidr.class, (ahbh)(a = new aidr()));
    }
    
    private aidr() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aidr.d) == null) {
                    synchronized (aidr.class) {
                        if (aidr.d == null) {
                            aidr.d = (ahdd)new ahba((ahbh)aidr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidr.a;
            }
            case 4: {
                return new ahaz((ahbh)aidr.a);
            }
            case 3: {
                return new aidr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidr.a, "\u0001\u0001\u0001\u0000\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u143c\u0000", new Object[] { "c", "b", amgs.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
