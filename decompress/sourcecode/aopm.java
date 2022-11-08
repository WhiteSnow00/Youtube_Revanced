import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopm extends agzi implements ahax
{
    public static final aopm a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance((Class)aopm.class, (agzi)(a = new aopm()));
    }
    
    private aopm() {
        this.b = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy b = this.b;
        if (!b.c()) {
            this.b = agzi.mutableCopy(b);
        }
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aopm.c) == null) {
                    synchronized (aopm.class) {
                        if (aopm.c == null) {
                            aopm.c = (ahbe)new agzb((agzi)aopm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aopm.a;
            }
            case 4: {
                return new agza((byte[][])null, (char[])null);
            }
            case 3: {
                return new aopm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopm.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[] { "b" });
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
