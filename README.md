docker build  -t pdngayan1/backend .
docker push pdngayan1/backend

docker run -p 8080:8080 pdngayan1/backend



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


git init
git add .
git commit -m "Add existing project files to Git"
git remote add origin https://github.com/pdngayan/boc-demo-backend.git
git push --set-upstream origin main 