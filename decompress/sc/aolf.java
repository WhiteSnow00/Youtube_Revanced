import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolf extends ahbh implements ahcw
{
    public static final aolf a;
    public static final ahbf b;
    private static volatile ahdd e;
    public ahbx c;
    public String d;
    private int f;
    private byte g;
    
    static {
        final aolf a2 = new aolf();
        ahbh.registerDefaultInstance((Class)aolf.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 355559704, ahek.k, (Class)aolf.class);
    }
    
    private aolf() {
        this.g = 2;
        this.c = emptyProtobufList();
        this.d = "";
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
                final ahdd e;
                if ((e = aolf.e) == null) {
                    synchronized (aolf.class) {
                        if (aolf.e == null) {
                            aolf.e = (ahdd)new ahba((ahbh)aolf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aolf.a;
            }
            case 4: {
                return new ahaz((ahbh)aolf.a);
            }
            case 3: {
                return new aolf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolf.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001\u041b\u0003\u1008\u0001", new Object[] { "f", "c", ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, "d" });
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
