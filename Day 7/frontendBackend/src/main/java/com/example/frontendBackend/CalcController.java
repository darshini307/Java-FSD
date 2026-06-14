package com.example.frontendBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController

public class CalcController {
    @GetMapping("/calc/{num1}/{num2}")
    public Map<String,Object> add(@PathVariable int num1,@PathVariable int num2){
        int res = num1+num2;
        //return "Addition: "+res;
        return Map.of("operation","addition","result",res);

    }
    @GetMapping("/calc/sin/{deg}")
    public String calcSin(@PathVariable double deg){
        double radian = Math.toRadians(deg);
        double sinValue = Math.round(Math.sin(radian)*100.0)/100.0;
        return "Sin: "+sinValue;
    }
    @GetMapping("/calc/cos/{deg}")
    public String calcCos(@PathVariable double deg){
        double radian = Math.toRadians(deg);
        double cosValue = Math.round(Math.cos(radian)*100.0)/100.0;
        return "Cos : "+cosValue;
    }
    @GetMapping("/calc/log/{number}")
    public String calcLog(@PathVariable double number){
        return "Log Value: "+Math.round(Math.log(number)*100.0)/100.0;
    }
    @GetMapping("/calc/spiral")
    public List<Integer> spiral() {
            int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            int m = arr.length;
            int n = arr[0].length;
            int[] dr = {0,1,0,-1};
            int[] dc = {1,0,-1,0};
            int idx = 0;
            int r = 0;
            int c = 0;
            boolean[][] vis = new boolean[m][n];
            ArrayList<Integer> res = new ArrayList<>();
            for(int i  = 0;i<m*n;i++){
                res.add(arr[r][c]);
                vis[r][c] = true;
                int newR = r+dr[idx];
                int newC = c+dc[idx];

                if(newR>=0 && newR<m && newC >=0 && newC<n && !vis[newR][newC]){
                    r = newR;
                    c = newC;
                }
                else{
                    idx = (idx+1)%4;
                    r = r+dr[idx];
                    c = c+dc[idx];
                }
            }

        return res;
    }
    @GetMapping("/calc/isPerfect/{num1}")
    public String isPerfect(@PathVariable int num1){
        int sum = 0;
        for(int i = 1;i<=num1/2;i++){
            if(num1%i==0){
                sum+=i;
            }
        }
        if(sum==num1){
            return "Perfect Number";
        }

        return "Not a perfect Number";


    }

}
