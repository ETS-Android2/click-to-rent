package com.orange.click_2_rent.Firebase;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.orange.click_2_rent.Models.Client;

public class FireBaseUtils {

    public static CollectionReference mRefCollection;
    public static final String TASK_COLLECTION = "TASCHES";
    public static final String CLIENT_COLLECTION = "users";
    public static final String PRESTATAIRES_COLLECTION = "prestataire";
    public static final String SERVICE_COLLECTION = "service";



    public void setup() {
        // [START get_firestore_instance]
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        // [END get_firestore_instance]

        // [START set_firestore_settings]
        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build();
        db.setFirestoreSettings(settings);
        // [END set_firestore_settings]
    }

    public static CollectionReference getReferenceFirestore(String CollectionName){
        if(mRefCollection == null){
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            mRefCollection = db.collection(CollectionName);
            return mRefCollection;
        }
        return mRefCollection;
    }

    public static void addUser(Client client, Context context){
        getReferenceFirestore(CLIENT_COLLECTION)
                .add(client)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d("SUCCES","Insertion reussi !");
                        Toast.makeText(context,"Insertion reussi :", Toast.LENGTH_LONG).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d("ECHECS","Insertion echouer ");
                    }
                });
    }

    public static CollectionReference getCollection(String CollectionName){

        CollectionReference cr = getReferenceFirestore(CLIENT_COLLECTION)
                .getFirestore().collection(CollectionName);

        Log.d("STRUCT:",cr.toString());

        return cr;
    }

    public void getAllUsers() {
        // [START get_all_users]
//        db.collection("users")
//                .get()
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                    @Override
//                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                        if (task.isSuccessful()) {
//                            for (QueryDocumentSnapshot document : task.getResult()) {
//                                Log.d(TAG, document.getId() + " => " + document.getData());
//                            }
//                        } else {
//                            Log.w(TAG, "Error getting documents.", task.getException());
//                        }
//                    }
//                });
        // [END get_all_users]
    }

}
