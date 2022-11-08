// 
// Decompiled by Procyon v0.6.0
// 

public final class daf
{
    public static final dae a;
    static final dae b;
    static final dae c;
    public static final dae d;
    public static final dae e;
    static final dae f;
    static final dae g;
    public static final dae h;
    public static final dae i;
    public static final dae j;
    static final dae k;
    public static final dae l;
    static final dae m;
    static final dae n;
    static final dae o;
    
    static {
        a = cje.c(3, "Google Play In-app Billing API version is less than 3");
        cje.c(3, "Google Play In-app Billing API version is less than 9");
        b = cje.c(3, "Billing service unavailable on device.");
        c = cje.c(5, "Client is already in the process of connecting to billing service.");
        d = cje.c(5, "The list of SKUs can't be empty.");
        e = cje.c(5, "SKU type can't be empty.");
        cje.c(5, "Product type can't be empty.");
        f = cje.c(-2, "Client does not support extra params.");
        cje.c(5, "Invalid purchase token.");
        g = cje.c(6, "An internal error occurred.");
        cje.c(5, "SKU can't be null.");
        h = cje.c(0, "");
        i = cje.c(-1, "Service connection is disconnected.");
        j = cje.c(-3, "Timeout communicating with service.");
        k = cje.c(-2, "Client does not support subscriptions.");
        cje.c(-2, "Client does not support subscriptions update.");
        cje.c(-2, "Client does not support get purchase history.");
        cje.c(-2, "Client does not support price change confirmation.");
        l = cje.c(-2, "Play Store version installed does not support cross selling products.");
        m = cje.c(-2, "Client does not support multi-item purchases.");
        n = cje.c(-2, "Client does not support offer_id_token.");
        o = cje.c(-2, "Client does not support ProductDetails.");
        cje.c(-2, "Client does not support in-app messages.");
        cje.c(-2, "Client does not support alternative billing.");
        cje.c(5, "Unknown feature");
        cje.c(-2, "Play Store version installed does not support get billing config.");
    }
}
