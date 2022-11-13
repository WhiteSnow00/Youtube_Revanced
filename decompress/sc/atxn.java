import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxn extends ahbh implements ahcw
{
    public static final atxn a;
    private static volatile ahdd k;
    public int b;
    public long c;
    public int d;
    public ahbx e;
    public int f;
    public int g;
    public int h;
    public ahbx i;
    public String j;
    
    static {
        ahbh.registerDefaultInstance((Class)atxn.class, (ahbh)(a = new atxn()));
    }
    
    private atxn() {
        this.e = ahbh.emptyProtobufList();
        this.i = ahbh.emptyProtobufList();
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = atxn.k) == null) {
                    synchronized (atxn.class) {
                        if (atxn.k == null) {
                            atxn.k = (ahdd)new ahba((ahbh)atxn.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return atxn.a;
            }
            case 4: {
                return new ahaz((int[])null, (float[][])null);
            }
            case 3: {
                return new atxn();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxn.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u1002\u0000\u0002\u100b\u0001\u0003\u001a\u0004\u100b\u0002\u0005\u100c\u0003\u0006\u1004\u0004\u0007\u001a\b\u1008\u0005", new Object[] { "b", "c", "d", "e", "f", "g", areg.g, "h", "i", "j" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
