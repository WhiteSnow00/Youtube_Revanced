import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqln extends ahbh implements ahcw
{
    public static final aqln a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public String d;
    public ahbx e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqln.class, (ahbh)(a = new aqln()));
    }
    
    private aqln() {
        this.g = 2;
        this.c = emptyProtobufList();
        this.d = "";
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqln.f) == null) {
                    synchronized (aqln.class) {
                        if (aqln.f == null) {
                            aqln.f = (ahdd)new ahba((ahbh)aqln.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqln.a;
            }
            case 4: {
                return new ahaz((int[][][])null, (float[])null);
            }
            case 3: {
                return new aqln();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqln.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u041b\u0002\u1008\u0000\u0003\u001b", new Object[] { "b", "c", aqlj.class, "d", "e", aqlm.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
